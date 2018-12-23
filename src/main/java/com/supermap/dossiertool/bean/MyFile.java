package com.supermap.dossiertool.bean;

import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 22:13 2018/12/20 0020
 */
public class MyFile {

    private String text;
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public MyFile(String text,String path) {
        this.text = text;
        this.path = path;
    }

    public MyFile(){
    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



}
