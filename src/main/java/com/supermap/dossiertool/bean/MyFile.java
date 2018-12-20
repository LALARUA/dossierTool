package com.supermap.dossiertool.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 22:13 2018/12/20 0020
 */
public class MyFile {
    private List<MyFile> sonFile;
    private String fileName;
    private boolean isFolder;


    public MyFile(String fileName,boolean isFolder) {
        this.fileName = fileName;
        this.isFolder = isFolder;
    }

    public MyFile(String fileName) {
        this.fileName = fileName;
    }

    public MyFile(){
    }

    public List<MyFile> getSonFile() {
        return sonFile;
    }

    public void setSonFile(List<MyFile> sonFile) {
        this.sonFile = sonFile;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean isFolder() {
        return isFolder;
    }

    public void setFolder(boolean folder) {
        isFolder = folder;
    }
}
