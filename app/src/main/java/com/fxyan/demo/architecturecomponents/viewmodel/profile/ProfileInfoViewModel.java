package com.fxyan.demo.architecturecomponents.viewmodel.profile;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.fxyan.demo.architecturecomponents.net.profile.ProfileRepository;
import com.fxyan.demo.architecturecomponents.pojo.resp.profile.ProfileInfo;

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
 * @createTime: 2017/11/1 下午12:55
 * @records(modify):
 */
public final class ProfileInfoViewModel extends ViewModel {

    private ProfileRepository profileRepository;
    private MutableLiveData<ProfileInfo> profileInfo;

    public ProfileInfoViewModel() {
        this.profileRepository = new ProfileRepository();
        profileInfo = new MutableLiveData<>();
    }

    public void fetchProfileInfo() {
        profileRepository.fetchProfileInfo(profileInfo);
    }

    public LiveData<ProfileInfo> getProfileInfo() {
        return profileInfo;
    }
}
