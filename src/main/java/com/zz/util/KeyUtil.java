package com.zz.util;

import java.util.Random;

public class KeyUtil {

    public static synchronized String genUniqueKey(){

        Random random = new Random();
        Integer number=random.nextInt(90);
        //random.nextInt()带参的nextInt(int x)则会生成一个范围在0~x（不包含X）内的任意正整数 +后面的是最小范围，默认为0
        return System.currentTimeMillis()+String.valueOf(number);
        //毫秒数System.currentTimeMillis()去代替new Date()，
    }
}
//Integer number=random.nextInt(900000)+100000;
//        return System.currentTimeMillis()+ String.valueOf(number);
//