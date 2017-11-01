package com.fxyan.demo.architecturecomponents.ui.profile;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.fxyan.demo.architecturecomponents.pojo.resp.profile.ProfileInfo;
import com.fxyan.demo.architecturecomponents.viewmodel.profile.ProfileInfoViewModel;
import com.fxyan.demo.architecturecomponents.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * <pre>
 *      ┏┛ ┻━━━━━┛ ┻┓
 *      ┃　　　　　　 ┃
 *      ┃　　　━　　　┃
 *      ┃　┳┛　  ┗┳　┃
 *      ┃　　　　　　 ┃
 *      ┃　　　┻　　　┃
 *      ┃　　　　　　 ┃
 *      ┗━┓　　　┏━━━┛
 *        ┃　　　┃   神兽保佑
 *        ┃　　　┃   代码无BUG！
 *        ┃　　　┗━━━━━━━━━┓
 *        ┃　　　　　　　    ┣┓
 *        ┃　　　　         ┏┛
 *        ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛
 *          ┃ ┫ ┫   ┃ ┫ ┫
 *          ┗━┻━┛   ┗━┻━┛
 * </pre>
 *
 * @author: fxYan
 * @description:
 * @createTime: 2017/10/31 下午11:37
 * @records(modify):
 */
public final class UserInfoActivity extends LifecycleActivity {

    @BindView(R.id.tv_nick)
    TextView nickTv;
    @BindView(R.id.tv_sex)
    TextView sexTv;
    @BindView(R.id.tv_phone)
    TextView phoneTv;

    private ProfileInfoViewModel profileInfoViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        ButterKnife.bind(this);

        profileInfoViewModel = new ProfileInfoViewModel();
        profileInfoViewModel.getProfileInfo().observe(this,
                new Observer<ProfileInfo>() {
                    @Override
                    public void onChanged(@Nullable ProfileInfo profileInfo) {
                        nickTv.setText(profileInfo.getUserNick());
                        sexTv.setText(profileInfo.getUserSex());
                        phoneTv.setText(profileInfo.getUserPhone());
                    }
                });
        profileInfoViewModel.fetchProfileInfo();
    }

}
