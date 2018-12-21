package com.supermap.dossiertool.pojo;

import org.springframework.web.util.pattern.PathPattern;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 15:50 2018/12/21 0021
 */
public class DAS_BDC {
    private String BDCID;
    private String AJID;
    private String BDCDYH;
    private String ZL;
    private String YWLX;
    private String QZH;
    public DAS_BDC(){
        this.YWLX = "DAS_CQ";
    }

    public String getBDCID() {
        return BDCID;
    }

    public void setBDCID(String BDCID) {
        this.BDCID = BDCID;
    }

    public String getAJID() {
        return AJID;
    }

    public void setAJID(String AJID) {
        this.AJID = AJID;
    }

    public String getBDCDYH() {
        return BDCDYH;
    }

    public void setBDCDYH(String BDCDYH) {
        this.BDCDYH = BDCDYH;
    }

    public String getZL() {
        return ZL;
    }

    public void setZL(String ZL) {
        this.ZL = ZL;
    }

    public String getYWLX() {
        return YWLX;
    }

    public void setYWLX(String YWLX) {
        this.YWLX = YWLX;
    }

    public String getQZH() {
        return QZH;
    }

    public void setQZH(String QZH) {
        this.QZH = QZH;
    }
}
