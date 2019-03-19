package edu.shu.pojo;

public class ViewLxsj {
    private String 学号;

    private String 姓名;

    private String 学院;

    private String 留学类别;

    private String 项目类别;

    private String 派出时间;

    private String 出访国家;

    private String 出访学校;

    private String 出访学校中文名称;

    public String get学号() {
        return 学号;
    }

    public void set学号(String 学号) {
        this.学号 = 学号 == null ? null : 学号.trim();
    }

    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名 == null ? null : 姓名.trim();
    }

    public String get学院() {
        return 学院;
    }

    public void set学院(String 学院) {
        this.学院 = 学院 == null ? null : 学院.trim();
    }

    public String get留学类别() {
        return 留学类别;
    }

    public void set留学类别(String 留学类别) {
        this.留学类别 = 留学类别 == null ? null : 留学类别.trim();
    }

    public String get项目类别() {
        return 项目类别;
    }

    public void set项目类别(String 项目类别) {
        this.项目类别 = 项目类别 == null ? null : 项目类别.trim();
    }

    public String get派出时间() {
        return 派出时间;
    }

    public void set派出时间(String 派出时间) {
        this.派出时间 = 派出时间 == null ? null : 派出时间.trim();
    }

    public String get出访国家() {
        return 出访国家;
    }

    public void set出访国家(String 出访国家) {
        this.出访国家 = 出访国家 == null ? null : 出访国家.trim();
    }

    public String get出访学校() {
        return 出访学校;
    }

    public void set出访学校(String 出访学校) {
        this.出访学校 = 出访学校 == null ? null : 出访学校.trim();
    }

    public String get出访学校中文名称() {
        return 出访学校中文名称;
    }

    public void set出访学校中文名称(String 出访学校中文名称) {
        this.出访学校中文名称 = 出访学校中文名称 == null ? null : 出访学校中文名称.trim();
    }
}