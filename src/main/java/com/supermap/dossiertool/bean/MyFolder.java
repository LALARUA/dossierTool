package com.supermap.dossiertool.bean;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 21:01 2018/12/22 0022
 */
public class MyFolder extends MyFile {
    private List<MyFile> nodes;

   public MyFolder(String text,String path){
       super(text,path);
       nodes = new LinkedList<>();
   }

    public MyFolder() {
    }


    public List<MyFile> getNodes() {
        return nodes;
    }


    public void setNodes(List<MyFile> nodes) {
        this.nodes = nodes;
    }
}
