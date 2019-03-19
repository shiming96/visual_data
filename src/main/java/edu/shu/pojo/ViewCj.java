package edu.shu.pojo;

import java.math.BigDecimal;

public class ViewCj {
    private String xh;

    private Integer termcode;

    private String kcbh;

    private BigDecimal cj;

    private BigDecimal kcxf;

    private String cjsxm;

    private String cjsx;

    private String kclbm;

    private String kclb;

    private String kcmc;

    private Integer bfz;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public Integer getTermcode() {
        return termcode;
    }

    public void setTermcode(Integer termcode) {
        this.termcode = termcode;
    }

    public String getKcbh() {
        return kcbh;
    }

    public void setKcbh(String kcbh) {
        this.kcbh = kcbh == null ? null : kcbh.trim();
    }

    public BigDecimal getCj() {
        return cj;
    }

    public void setCj(BigDecimal cj) {
        this.cj = cj;
    }

    public BigDecimal getKcxf() {
        return kcxf;
    }

    public void setKcxf(BigDecimal kcxf) {
        this.kcxf = kcxf;
    }

    public String getCjsxm() {
        return cjsxm;
    }

    public void setCjsxm(String cjsxm) {
        this.cjsxm = cjsxm == null ? null : cjsxm.trim();
    }

    public String getCjsx() {
        return cjsx;
    }

    public void setCjsx(String cjsx) {
        this.cjsx = cjsx == null ? null : cjsx.trim();
    }

    public String getKclbm() {
        return kclbm;
    }

    public void setKclbm(String kclbm) {
        this.kclbm = kclbm == null ? null : kclbm.trim();
    }

    public String getKclb() {
        return kclb;
    }

    public void setKclb(String kclb) {
        this.kclb = kclb == null ? null : kclb.trim();
    }

    public String getKcmc() {
        return kcmc;
    }

    public void setKcmc(String kcmc) {
        this.kcmc = kcmc == null ? null : kcmc.trim();
    }

    public Integer getBfz() {
        return bfz;
    }

    public void setBfz(Integer bfz) {
        this.bfz = bfz;
    }
}