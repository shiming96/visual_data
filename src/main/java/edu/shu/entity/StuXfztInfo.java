package edu.shu.entity;

import java.io.Serializable;

public class StuXfztInfo implements Serializable {

    private String xh;
    private String hasxf;
    private String needxf;

    public StuXfztInfo() {
    }

    public StuXfztInfo(String xh, String hasxf, String needxf) {
        this.xh = xh;
        this.hasxf = hasxf;
        this.needxf = needxf;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getHasxf() {
        return hasxf;
    }

    public void setHasxf(String hasxf) {
        this.hasxf = hasxf;
    }

    public String getNeedxf() {
        return needxf;
    }

    public void setNeedxf(String needxf) {
        this.needxf = needxf;
    }
}
