package edu.shu.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class XjSendDataSimple implements Serializable {

    private String title;
    private List<String> xAxis;
    private Map<String, Object> series;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getxAxis() {
        return xAxis;
    }

    public void setxAxis(List<String> xAxis) {
        this.xAxis = xAxis;
    }

    public Map<String, Object> getSeries() {
        return series;
    }

    public void setSeries(Map<String, Object> series) {
        this.series = series;
    }
}
