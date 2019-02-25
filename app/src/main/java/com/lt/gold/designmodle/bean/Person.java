package com.lt.gold.designmodle.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Creat by ${user} on ${date}
 */
public class Person<T> {


    private String name;

    private List<String> [] arrayLists=new ArrayList[10];
    
    public <K> K getName(K k){

        return k;
    }

    public <T> T getName2(T t){

        return t;
    }



}
