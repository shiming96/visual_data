package edu.shu.entity;

import java.io.Serializable;

public class XqDetails implements Serializable {
    private String college;
    private String grade;

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
