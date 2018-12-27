package com.supermap.dossiertool.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.supermap.dossiertool.function.MyFunction;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 15:38 2018/12/21 0021
 */
public class DAS_AJJBXX {
    private String AJID;
    private int ND;
    private String QZH;
    private String AJH;
    private int WJJS;
    private int WJYS;
    private int BCQX;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date SCRQ;

    private int YXBZ;

    public DAS_AJJBXX(){
        this.ND = 5;
    }
    public DAS_AJJBXX(String AJID, int ND, String QZH, String AJH, int WJJS,int WJYS, int BCQX, Date SCRQ, int YXBZ) {
        this.AJID = AJID;
        this.ND = ND;
        this.QZH = QZH;
        this.AJH = AJH;
        this.WJJS = WJJS;
        this.WJYS = WJYS;
        this.BCQX = BCQX;
        this.SCRQ = SCRQ;
        this.YXBZ = YXBZ;
    }
    public void build(String AJID, int ND, String QZH, String AJH, int WJJS,int WJYS, int BCQX, Date SCRQ, int YXBZ){
        this.AJID = AJID;
        this.ND = ND;
        this.QZH = QZH;
        this.AJH = AJH;
        this.WJJS = WJJS;
        this.WJYS = WJYS;
        this.BCQX = BCQX;
        this.SCRQ = SCRQ;
        this.YXBZ = YXBZ;
    }

    @Override
    public String toString() {
        return "DAS_AJJBXX{" +
                "AJID='" + AJID + '\'' +
                ", ND=" + ND +
                ", QZH='" + QZH + '\'' +
                ", AJH='" + AJH + '\'' +
                ", WJJS=" + WJJS +
                ", WJYS=" + WJYS +
                ", BCQX=" + BCQX +
                ", SCRQ=" + SCRQ +
                ", YXBZ=" + YXBZ +
                '}';
    }

    public int getWJYS() {
        return WJYS;
    }

    public void setWJYS(int WJYS) {
        this.WJYS = WJYS;
    }





    public String getAJID() {
        return AJID;
    }

    public void setAJID(String AJID) {
        this.AJID = AJID;
    }

    public int getND() {
        return ND;
    }

    public void setND(int ND) {
        this.ND = ND;
    }

    public String getQZH() {
        return QZH;
    }

    public void setQZH(String QZH) {
        this.QZH = QZH;
    }

    public String getAJH() {
        return AJH;
    }

    public void setAJH(String AJH) {
        this.AJH = AJH;
    }

    public int getWJJS() {
        return WJJS;
    }

    public void setWJJS(int WJJS) {
        this.WJJS = WJJS;
    }

    public int getBCQX() {
        return BCQX;
    }

    public void setBCQX(int BCQX) {
        this.BCQX = BCQX;
    }

    public Date getSCRQ() {
        return SCRQ;
    }

    public void setSCRQ(Date SCRQ) {
        this.SCRQ = SCRQ;
    }

    public int getYXBZ() {
        return YXBZ;
    }

    public void setYXBZ(int YXBZ) {
        this.YXBZ = YXBZ;
    }
}
