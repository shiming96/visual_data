package edu.shu.pojo;

import java.math.BigDecimal;

public class ViewPyjh {
    private String xy;

    private Integer id;

    private String xh;

    private String kcbh;

    private String xklx;

    private BigDecimal kcxf;

    private Integer xxxq;

    private String bz;

    private String kclx;

    public String getXy() {
        return xy;
    }

    public void setXy(String xy) {
        this.xy = xy == null ? null : xy.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getKcbh() {
        return kcbh;
    }

    public void setKcbh(String kcbh) {
        this.kcbh = kcbh == null ? null : kcbh.trim();
    }

    public String getXklx() {
        return xklx;
    }

    public void setXklx(String xklx) {
        this.xklx = xklx == null ? null : xklx.trim();
    }

    public BigDecimal getKcxf() {
        return kcxf;
    }

    public void setKcxf(BigDecimal kcxf) {
        this.kcxf = kcxf;
    }

    public Integer getXxxq() {
        return xxxq;
    }

    public void setXxxq(Integer xxxq) {
        this.xxxq = xxxq;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getKclx() {
        return kclx;
    }

    public void setKclx(String kclx) {
        this.kclx = kclx == null ? null : kclx.trim();
    }
}