package utils;

import edu.shu.entity.XjSendData;

import java.util.*;

public class XJDataUtils {

    //Enforce noninstantiability with a private constructor
    private XJDataUtils() {
        throw new AssertionError(); //避免不小心在类的内部调用构造器
    }

    public static XjSendData dataProcessing(List<Object[]> data, String[] xAxis, String[] legend, String category) {

        XjSendData xjSendData = new XjSendData();
        List<Map<String, Object>> listMap = new ArrayList<>();
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();


        for (int i = 0; i < data.size(); i++) {
            Map<String, Object> dataMap = new HashMap<>();
            if(legend != null) {
                dataMap.put("name", legend[i]);
            }
            dataMap.put("data", data.get(i));
            listMap.add(dataMap);
        }

        if(xAxis != null) {
            for (String s : xAxis) {
                list1.add(s);
            }
            xjSendData.setxAxis(list1);
        }
        if(legend != null) {
            for (String s : legend) {
                list2.add(s);
            }
            xjSendData.setLegend(list2);
        }

        xjSendData.setTitle(category);
        xjSendData.setSeries(listMap);


        return xjSendData;
    }
}
