package com.supermap.dossiertool.smattrEntity;

import com.supermap.dossiertool.bean.QlrAndSyq;

import java.util.ArrayList;
import java.util.List;

public class TxmWithBLOBs extends Txm {

    private List<QlrAndSyq> qlrAndSyqs = new ArrayList<>();


    private byte[] dabhtxm;

    private byte[] dalxbhtxm;

    public List<QlrAndSyq> getQlrAndSyqs() {
        return qlrAndSyqs;
    }

    public void setQlrAndSyqs(List<QlrAndSyq> qlrAndSyqs) {
        this.qlrAndSyqs = qlrAndSyqs;
    }

    public byte[] getDabhtxm() {
        return dabhtxm;
    }

    public void setDabhtxm(byte[] dabhtxm) {
        this.dabhtxm = dabhtxm;
    }

    public byte[] getDalxbhtxm() {
        return dalxbhtxm;
    }

    public void setDalxbhtxm(byte[] dalxbhtxm) {
        this.dalxbhtxm = dalxbhtxm;
    }
}