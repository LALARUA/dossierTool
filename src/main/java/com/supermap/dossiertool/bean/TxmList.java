package com.supermap.dossiertool.bean;

import com.supermap.dossiertool.smattrEntity.Txm;
import com.supermap.dossiertool.smattrEntity.TxmWithBLOBs;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 10:39 2019/1/4 0004
 */
public class TxmList {
    private List<TxmWithBLOBs> txms = new ArrayList<>();

    public List<TxmWithBLOBs> getTxms() {
        return txms;
    }

    public void setTxms(List<TxmWithBLOBs> txms) {
        this.txms = txms;
    }
}
