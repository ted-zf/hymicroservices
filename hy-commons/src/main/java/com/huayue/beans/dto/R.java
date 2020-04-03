package com.huayue.beans.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class R<T> implements Serializable {
    /** 服务端数据*/
    private T data;
    /** 状态码，0：成功，1：失败*/
    private int status = 0;
    /** 描述信息 */
    private String msg = "";

    // 省略 set get

    public static R isOk() {
        return new R().msg("成功");
    }

    public static R isFail() {
        return new R().status(1).msg("失败");
    }

    public static R isFail(Throwable e) {
        return isFail().msg(e);
    }

    public R msg(Throwable e) {
        this.setMsg(e.toString());
        return this;
    }

    public R data(T data) {
        this.setData(data);
        return this;
    }

    public R msg(String msg){
        this.setMsg(msg);
        return this;
    }

    public R status(int status) {
        this.setStatus(status);
        return this;
    }
}