package edu.shu.entity;

import java.io.Serializable;

public class StuCjyjInfo implements Serializable {
    private String xh;
    private int num;

    public StuCjyjInfo() {
    }

    public StuCjyjInfo(String xh, int num) {
        this.xh = xh;
        this.num = num;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
