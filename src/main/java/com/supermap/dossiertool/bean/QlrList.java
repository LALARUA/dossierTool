package com.supermap.dossiertool.bean;

import com.supermap.dossiertool.smattrEntity.Qlr;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 15:31 2018/12/28 0028
 */
public class QlrList {
    List<Qlr> qlrs = new ArrayList<>();

    public List<Qlr> getQlrs() {
        return qlrs;
    }

    public void setQlrs(List<Qlr> qlrs) {
        this.qlrs = qlrs;
    }
}
