package com.supermap.dossiertool.smattrEntity;

import com.supermap.dossiertool.bean.QlrAndSyq;

import java.util.ArrayList;
import java.util.List;

public class TxmWithBLOBs extends Txm {

    private List<QlrAndSyq> qlrAndSyqs = new ArrayList<>();

    private Zdjbxx zdjbxx;


    private byte[] dabhtxm;

    private byte[] dalxbhtxm;

    public Zdjbxx getZdjbxx() {
        return zdjbxx;
    }

    public void setZdjbxx(Zdjbxx zdjbxx) {
        this.zdjbxx = zdjbxx;
    }

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