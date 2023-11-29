package com.green.day44;

public class MyOpenAPI {
    private MyInfo info;

    public MyOpenAPI info(MyInfo info){
        this.info = info;
        return this;
    }
    @Override
    public String toString(){
        return String.format("myInfo - %s", info);
    }
}
