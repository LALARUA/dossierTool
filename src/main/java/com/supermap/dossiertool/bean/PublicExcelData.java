package com.supermap.dossiertool.bean;

import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 10:19 2018/12/22 0022
 */
public class PublicExcelData {
    public String DABH;
    private List<String> QLR;  //权利人
    private List<String> TDZH; //土地证号
    private String FWZL; //房屋坐落
    private String FPYS;
    private String BGQX;
    private String ZDDM;
    private String ZDTZM;
    private String DALXBH;
    private String DALX;

    public String getDABH() {
        return DABH;
    }

    public String getZDTZM() {
        return ZDTZM;
    }

    public void setZDTZM(String ZDTZM) {
        this.ZDTZM = ZDTZM;
    }

    public void setDABH(String DABH) {
        this.DABH = DABH;
    }

    public String getDALXBH() {
        return DALXBH;
    }

    public void setDALXBH(String DALXBH) {
        this.DALXBH = DALXBH;
    }

    public String getDALX() {
        return DALX;
    }

    public void setDALX(String DALX) {
        this.DALX = DALX;
    }

    public String getZDDM() {
        return ZDDM;
    }

    public void setZDDM(String ZDDM) {
        this.ZDDM = ZDDM;
    }

    public String getFPYS() {
        return FPYS;
    }

    public void setFPYS(String FPYS) {
        this.FPYS = FPYS;
    }

    public String getBGQX() {
        return BGQX;
    }

    public void setBGQX(String BGQX) {
        this.BGQX = BGQX;
    }

    public List<String> getQLR() {
        return QLR;
    }

    public void setQLR(List<String> QLR) {
        this.QLR = QLR;
    }

    public List<String> getTDZH() {
        return TDZH;
    }

    public void setTDZH(List<String> TDZH) {
        this.TDZH = TDZH;
    }

    public String getFWZL() {
        return FWZL;
    }

    public void setFWZL(String FWZL) {
        this.FWZL = FWZL;
    }
}
