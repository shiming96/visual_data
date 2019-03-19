package edu.shu.pojo;

import java.util.Date;

public class ViewXjyd {
    private Long id;

    private String 学号;

    private String 学籍异动码;

    private String 学籍异动日;

    private String 备注;

    private String 操作人;

    private Date 操作时间;

    private String 休学终止日;

    private String 休学起始日;

    private String 已复学;

    private String 学籍异动;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String get学号() {
        return 学号;
    }

    public void set学号(String 学号) {
        this.学号 = 学号 == null ? null : 学号.trim();
    }

    public String get学籍异动码() {
        return 学籍异动码;
    }

    public void set学籍异动码(String 学籍异动码) {
        this.学籍异动码 = 学籍异动码 == null ? null : 学籍异动码.trim();
    }

    public String get学籍异动日() {
        return 学籍异动日;
    }

    public void set学籍异动日(String 学籍异动日) {
        this.学籍异动日 = 学籍异动日 == null ? null : 学籍异动日.trim();
    }

    public String get备注() {
        return 备注;
    }

    public void set备注(String 备注) {
        this.备注 = 备注 == null ? null : 备注.trim();
    }

    public String get操作人() {
        return 操作人;
    }

    public void set操作人(String 操作人) {
        this.操作人 = 操作人 == null ? null : 操作人.trim();
    }

    public Date get操作时间() {
        return 操作时间;
    }

    public void set操作时间(Date 操作时间) {
        this.操作时间 = 操作时间;
    }

    public String get休学终止日() {
        return 休学终止日;
    }

    public void set休学终止日(String 休学终止日) {
        this.休学终止日 = 休学终止日 == null ? null : 休学终止日.trim();
    }

    public String get休学起始日() {
        return 休学起始日;
    }

    public void set休学起始日(String 休学起始日) {
        this.休学起始日 = 休学起始日 == null ? null : 休学起始日.trim();
    }

    public String get已复学() {
        return 已复学;
    }

    public void set已复学(String 已复学) {
        this.已复学 = 已复学 == null ? null : 已复学.trim();
    }

    public String get学籍异动() {
        return 学籍异动;
    }

    public void set学籍异动(String 学籍异动) {
        this.学籍异动 = 学籍异动 == null ? null : 学籍异动.trim();
    }
}