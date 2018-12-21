package com.supermap.dossiertool.bean;

import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 22:13 2018/12/20 0020
 */
public class MyFile {
    private List<MyFile> nodes;
    private String text;
    private boolean folder;


    public MyFile(String text, boolean folder) {
        this.text = text;
        this.folder = folder;
    }

    public MyFile(String text) {
        this.text = text;
    }

    public MyFile(){
    }

    public List<MyFile> getNodes() {
        return nodes;
    }

    public void setNodes(List<MyFile> nodes) {
        this.nodes = nodes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isFolder() {
        return folder;
    }

    public void setFolder(boolean folder) {
        folder = folder;
    }
}
