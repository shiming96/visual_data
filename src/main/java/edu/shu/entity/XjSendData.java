package edu.shu.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class XjSendData implements Serializable {

    private String title;
    private List<String> legend;
    private List<String> xAxis;
    private List<Map<String,Object>> series;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getLegend() {
        return legend;
    }

    public void setLegend(List<String> legend) {
        this.legend = legend;
    }

    public List<String> getxAxis() {
        return xAxis;
    }

    public void setxAxis(List<String> xAxis) {
        this.xAxis = xAxis;
    }

    public List<Map<String, Object>> getSeries() {
        return series;
    }

    public void setSeries(List<Map<String, Object>> series) {
        this.series = series;
    }
}
