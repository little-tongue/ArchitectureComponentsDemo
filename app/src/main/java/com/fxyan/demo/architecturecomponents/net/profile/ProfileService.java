package com.fxyan.demo.architecturecomponents.net.profile;

import com.fxyan.demo.architecturecomponents.pojo.resp.BaseRespBean;
import com.fxyan.demo.architecturecomponents.pojo.dto.EmptyDto;
import com.fxyan.demo.architecturecomponents.pojo.resp.profile.ProfileInfo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

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
 * @createTime: 2017/11/1 下午1:17
 * @records(modify):
 */
public interface ProfileService {

    @Headers("Content-Type: application/json")
    @POST("v3/user/detail")
    Call<BaseRespBean<ProfileInfo>> fetchUserInfo(
            @Header("Authorization") String authorization, @Body EmptyDto emptyBean);

}
