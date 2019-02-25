package com.lt.gold.designmodle.modle;

/**
 * Creat by ${user} on ${date}
 */
public class SingleTon {
    private static SingleTon instance=null;
    private SingleTon(){}
    public static  final SingleTon getInstance(){
        if (instance==null){
            synchronized (SingleTon.class){
                if (instance==null){
                    instance=new SingleTon();
                }
            }
        }
        return instance;
    }

}
