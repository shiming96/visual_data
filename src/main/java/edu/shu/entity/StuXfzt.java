package edu.shu.entity;

import java.io.Serializable;

public class StuXfzt implements Serializable {
    private String xh;  //学号
    private String xm;  //姓名
    private String xymc;    //学院名称
    private String cc;      // 硕士 | 博士
    private String hasxf;   //已修学分
    private String needxf;  //总学分

    //构建者模式
    public static class Builder {
        private final String xh;

        private String xm;
        private String xymc;
        private String cc;
        private String hasxf;
        private String needxf;

        public Builder(String xh) {
            this.xh = xh;
        }

        public Builder xm(String val) {
            xm = val;
            return this;
        }

        public Builder xymc(String val) {
            xymc = val;
            return this;
        }

        public Builder cc(String val) {
            cc = val;
            return this;
        }

        public Builder hasxf(String val) {
            hasxf = val;
            return this;
        }

        public Builder needxf(String val) {
            needxf = val;
            return this;
        }

        public StuXfzt build() {
            return new StuXfzt(this);
        }
    }

    //构造方法私有, 不可变类
    private StuXfzt(Builder builder) {
            xh = builder.xh;
            xm = builder.xm;
            xymc = builder.xymc;
            cc = builder.cc;
            needxf = builder.needxf;
            hasxf = builder.hasxf;
        }

    public String getXh() {
        return xh;
    }

    public String getXm() {
        return xm;
    }

    public String getXymc() {
        return xymc;
    }

    public String getCc() {
        return cc;
    }

    public String getHasxf() {
        return hasxf;
    }

    public String getNeedxf() {
        return needxf;
    }
}
