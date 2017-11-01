package com.fxyan.demo.architecturecomponents.net;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

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
 * @createTime: 2017/11/1 下午12:58
 * @records(modify):
 */
public final class HttpReqHelper {

    private Retrofit apiRetrofit;

    private HttpReqHelper() {
        apiRetrofit = new Retrofit.Builder()
                .baseUrl("http://daily.api.guoshujinfu.com/")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static HttpReqHelper getInstance() {
        return Holder.instance;
    }

    public Retrofit getApiRetrofit() {
        return apiRetrofit;
    }

    public static class Holder {
        private static final HttpReqHelper instance = new HttpReqHelper();
    }
}
