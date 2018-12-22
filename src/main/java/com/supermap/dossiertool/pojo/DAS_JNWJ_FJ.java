package com.supermap.dossiertool.pojo;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 15:51 2018/12/21 0021
 */
public class DAS_JNWJ_FJ {
    private String FJID;
    private String WJID;
    private int YH;
    private String FJMC;
    private int FJLX;
    private String PATH;
    private String FILETYPE;
    private String JNWJ_FJ_ID;
    private int ISRK;
    public DAS_JNWJ_FJ(){
        this.FJLX = 0;
        this.ISRK = 0;
    }

    public DAS_JNWJ_FJ(String FJID, String WJID, int YH,String FJMC, int FJLX, String PATH, String FILETYPE, String JNWJ_FJ_ID, int ISRK) {
        this.FJID = FJID;
        this.WJID = WJID;
        this.YH = YH;
        this.FJMC = FJMC;
        this.FJLX = FJLX;
        this.PATH = PATH;
        this.FILETYPE = FILETYPE;
        this.JNWJ_FJ_ID = JNWJ_FJ_ID;
        this.ISRK = ISRK;
    }

    public String getFJID() {
        return FJID;
    }

    public void setFJID(String FJID) {
        this.FJID = FJID;
    }

    public String getWJID() {
        return WJID;
    }

    public void setWJID(String WJID) {
        this.WJID = WJID;
    }

    public int getYH() {
        return YH;
    }

    public void setYH(int YH) {
        this.YH = YH;
    }

    public int getFJLX() {
        return FJLX;
    }

    public void setFJLX(int FJLX) {
        this.FJLX = FJLX;
    }

    public String getPATH() {
        return PATH;
    }

    public void setPATH(String PATH) {
        this.PATH = PATH;
    }

    public String getFILETYPE() {
        return FILETYPE;
    }

    public void setFILETYPE(String FILETYPE) {
        this.FILETYPE = FILETYPE;
    }

    public String getJNWJ_FJ_ID() {
        return JNWJ_FJ_ID;
    }

    public void setJNWJ_FJ_ID(String JNWJ_FJ_ID) {
        this.JNWJ_FJ_ID = JNWJ_FJ_ID;
    }

    public int getISRK() {
        return ISRK;
    }

    public void setISRK(int ISRK) {
        this.ISRK = ISRK;
    }
}
