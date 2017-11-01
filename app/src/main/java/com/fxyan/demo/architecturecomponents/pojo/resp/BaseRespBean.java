package com.fxyan.demo.architecturecomponents.pojo.resp;

import java.io.Serializable;

/**
 * @author: Domino
 * @className: BaseRespBean
 * @description: 网络请求返回bean的基础结构
 * @createTime: 2017/2/5 16:24
 */
public final class BaseRespBean<T> implements Serializable {
    private Boolean success;
    private String errorCode;
    private String errorMsg;
    private T data;

    public BaseRespBean() {
    }

    public BaseRespBean(Boolean success, String errorCode, String errorMsg, T data) {
        this.success = success;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseRespBean{" +
                "success=" + success +
                ", errorCode='" + errorCode + '\'' +
                ", errorMsg='" + errorMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
