package com.fxyan.demo.architecturecomponents.net.profile;

import android.arch.lifecycle.MutableLiveData;

import com.fxyan.demo.architecturecomponents.net.HttpReqHelper;
import com.fxyan.demo.architecturecomponents.pojo.dto.EmptyDto;
import com.fxyan.demo.architecturecomponents.pojo.resp.BaseRespBean;
import com.fxyan.demo.architecturecomponents.pojo.resp.profile.ProfileInfo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
 * @createTime: 2017/11/1 下午12:50
 * @records(modify):
 */
public final class ProfileRepository {

    public void fetchProfileInfo(final MutableLiveData<ProfileInfo> data) {
        HttpReqHelper.getInstance()
                .getApiRetrofit()
                .create(ProfileService.class)
                .fetchUserInfo("Bearerf52c83ef-ae34-480d-b4db-43211b77a9fc", new EmptyDto())
                .enqueue(new Callback<BaseRespBean<ProfileInfo>>() {
                    @Override
                    public void onResponse(Call<BaseRespBean<ProfileInfo>> call, Response<BaseRespBean<ProfileInfo>> response) {
                        data.setValue(response.body().getData());
                    }

                    @Override
                    public void onFailure(Call<BaseRespBean<ProfileInfo>> call, Throwable t) {

                    }
                });
    }

}
