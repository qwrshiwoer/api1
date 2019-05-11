package com.zz;

public class test {
    public static void main(String[] args) {
        int[] aa =new int[8];
        for (int i:aa){
            i++;
            aa[i]=i;
            System.out.println(i);
        }

    }
}