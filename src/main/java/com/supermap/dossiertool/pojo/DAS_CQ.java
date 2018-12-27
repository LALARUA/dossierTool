package com.supermap.dossiertool.pojo;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 15:50 2018/12/21 0021
 */
public class DAS_CQ {
    private String ID;
    private String AJID;
    private String SYQR;
    private String QZH;
    private String ZL;

    public DAS_CQ(){

    }
    public DAS_CQ(String ID, String AJID, String SYQR, String QZH, String ZL) {
        this.ID = ID;
        this.AJID = AJID;
        this.SYQR = SYQR;
        this.QZH = QZH;
        this.ZL = ZL;
    }
    public void build(String ID, String AJID, String SYQR, String QZH, String ZL){
        this.ID = ID;
        this.AJID = AJID;
        this.SYQR = SYQR;
        this.QZH = QZH;
        this.ZL = ZL;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAJID() {
        return AJID;
    }

    public void setAJID(String AJID) {
        this.AJID = AJID;
    }

    public String getSYQR() {
        return SYQR;
    }

    public void setSYQR(String SYQR) {
        this.SYQR = SYQR;
    }

    public String getQZH() {
        return QZH;
    }

    public void setQZH(String QZH) {
        this.QZH = QZH;
    }

    public String getZL() {
        return ZL;
    }

    public void setZL(String ZL) {
        this.ZL = ZL;
    }
}
