package com.imooc.girl.enums;

public enum ResultEnum {
    UNKONW_ERROR(-1, "未知错误"),

    SUCCESS(0, "成功"),

    PRIMARY_SCHOOL(100, "你还在上小学吧"),

    MIDDLE_SCHOOL(101, "你还在上初中吧");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
