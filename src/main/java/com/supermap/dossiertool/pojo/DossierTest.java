package com.supermap.dossiertool.pojo;

import org.apache.ibatis.type.Alias;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 17:02 2018/12/20 0020
 */

@Alias("wfd_acttype")
public class DossierTest {
    private String ACTTYPE_ID;
    private String ACTTYPE_NAME;

    @Override
    public String toString() {
        return "FileTest{" +
                "ACTTYPE_ID='" + ACTTYPE_ID + '\'' +
                ", ACTTYPE_NAME='" + ACTTYPE_NAME + '\'' +
                '}';
    }

    public String getACTTYPE_ID() {
        return ACTTYPE_ID;
    }

    public void setACTTYPE_ID(String ACTTYPE_ID) {
        this.ACTTYPE_ID = ACTTYPE_ID;
    }

    public String getACTTYPE_NAME() {
        return ACTTYPE_NAME;
    }

    public void setACTTYPE_NAME(String ACTTYPE_NAME) {
        this.ACTTYPE_NAME = ACTTYPE_NAME;
    }
}
