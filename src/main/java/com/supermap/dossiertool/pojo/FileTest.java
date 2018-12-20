package com.supermap.dossiertool.pojo;

import org.apache.ibatis.type.Alias;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 20:17 2018/12/20 0020
 */
@Alias("bdck_djq")
public class FileTest {

    private int smid;
    private String xzqdm;

    @Override
    public String toString() {
        return "FileTest{" +
                "smid=" + smid +
                ", xzqdm='" + xzqdm + '\'' +
                '}';
    }

    public int getSmid() {
        return smid;
    }

    public void setSmid(int smid) {
        this.smid = smid;
    }

    public String getXzqdm() {
        return xzqdm;
    }

    public void setXzqdm(String xzqdm) {
        this.xzqdm = xzqdm;
    }
}
