package com.zz.vo;

import lombok.Data;

import java.util.List;

@Data
public class ResultVo<T> {

    public String success;
    public String errorCode;
    public String msg;
    public T body;

}
