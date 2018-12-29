package com.supermap.dossiertool.bean;

import com.supermap.dossiertool.smattrEntity.Tdpzyt;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 15:29 2018/12/28 0028
 */
public class TdpzytList {
    List<Tdpzyt> tdpzyts = new ArrayList<>();

    public List<Tdpzyt> getTdpzyts() {
        return tdpzyts;
    }

    public void setTdpzyts(List<Tdpzyt> tdpzyts) {
        this.tdpzyts = tdpzyts;
    }
}
