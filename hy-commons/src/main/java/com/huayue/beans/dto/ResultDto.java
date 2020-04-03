package com.huayue.beans.dto;

import com.huayue.beans.enums.ResultEnum;

import java.io.Serializable;

/**
 * @author 西安华越
 */
public class ResultDto<T> implements Serializable {

    private int code;

    private String msg;

    private T data;

    public ResultDto(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public static ResultDto ok() {
        return new ResultDto(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getDesc(),null);
    }
    public static ResultDto ok(String msg) {
        return new ResultDto(ResultEnum.SUCCESS.getCode(),msg,null);
    }
    public static ResultDto ok(Object data) {
        return new ResultDto(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getDesc(),data);
    }
    public static ResultDto ok(ResultEnum codeEnum) {
        return new ResultDto(codeEnum.getCode(),codeEnum.getDesc(),null);
    }

    public static ResultDto ok(ResultEnum codeEnum,Object data) {
        return new ResultDto(codeEnum.getCode(),codeEnum.getDesc(),data);
    }

    public static ResultDto ok(int code,String msg,Object data) {
        return new ResultDto(code,msg,data);
    }
    public static ResultDto ok(int code,String msg) {
        return new ResultDto(code,msg,null);
    }
    public static ResultDto ok(int code,Object data) {
        return new ResultDto(code,ResultEnum.SUCCESS.getDesc(),data);
    }

    public static ResultDto ok(int code) {
        return new ResultDto(code,ResultEnum.SUCCESS.getDesc(),null);
    }

    public static ResultDto error(Object data) {

        return new ResultDto(ResultEnum.ERROR.getCode(),ResultEnum.ERROR.getDesc(),data);
    }
    public static ResultDto error(ResultEnum codeEnum) {

        return new ResultDto(codeEnum.getCode(),codeEnum.getDesc(),null);
    }
    public static ResultDto error(ResultEnum codeEnum,Object data) {

        return new ResultDto(codeEnum.getCode(),codeEnum.getDesc(),data);
    }
    public static ResultDto error() {
        return new ResultDto(ResultEnum.ERROR.getCode(),ResultEnum.ERROR.getDesc(),null);
    }
    public static ResultDto error(int code , String msg) {
        return new ResultDto(code,msg,null);
    }
    public static ResultDto error(int code , String msg,Object data) {
        return new ResultDto(code,msg,data);
    }

    /**给前台返回提示信息 给用户展示，例如年级名称不能为空等···*/
    public static ResultDto tipsInfo(String msg) {
        return new ResultDto(ResultEnum.TIPS_INFO.getCode(),msg,null);
    }


    public int getCode() {
        return code;
    }


    public void setCode(int code) {
        this.code = code;
    }


    public String getMsg() {
        return msg;
    }


    public void setMsg(String msg) {
        this.msg = msg;
    }


    public Object getData() {
        return data;
    }


    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[]args){

    }
}
