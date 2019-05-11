package com.zz.Enum;

public enum  ShopEnum {

    SUCCESS(200, "操作成功");

    private Integer code;
    private String message;

    ShopEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }
}
