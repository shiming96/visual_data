package edu.shu.entity;

import java.util.List;

public class QueryCriteria{

    private String college; //学院
    private String grade;   //年级
    private String discipline;  //专业
    private String start; //起始时间
    private String end;   //结束时间
    private String year;    //年度
    private List<String> Term;
    private String route;   //在哪个状态下

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<String> getTerm() {
        return Term;
    }

    public void setTerm(List<String> term) {
        Term = term;
    }
}
