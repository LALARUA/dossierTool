package com.supermap.dossiertool.smattrEntity;

public class TxmWithBLOBs extends pojo.Txm {
    private byte[] dabhtxm;

    private byte[] dalxbhtxm;

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