package edu.shu.entity;

import java.io.Serializable;

public class StuCjyj implements Serializable {
    private String xh;  //学号
    private String xm;  //姓名
    private String xymc;    //学院名称
    private String cc;      // 硕士 | 博士
    private int num;   //不及格门数

    //构建者模式
    public static class Builder {
        private final String xh;

        private String xm;
        private String xymc;
        private String cc;
        private int num;

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

        public Builder num(int val) {
            num = val;
            return this;
        }

        public StuCjyj build() {
            return new StuCjyj(this);
        }

    }

    //构造方法私有, 不可变类
    private StuCjyj(Builder builder) {
        xh = builder.xh;
        xm = builder.xm;
        xymc = builder.xymc;
        cc = builder.cc;
        num = builder.num;
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

    public int getNum() {
        return num;
    }
}
