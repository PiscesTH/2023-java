package com.green.day44;

public class MyInfo {
    private String title;

    public MyInfo title(String title){
        this.title = title;
        return this;
    }

    public String getTitle() {
        return title;
    }
    @Override
    public String toString(){
        return String.format("title : %s", title);
    }
}
