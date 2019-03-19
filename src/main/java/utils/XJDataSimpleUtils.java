package utils;

import edu.shu.entity.XjSendDataSimple;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class XJDataSimpleUtils {

    //Enforce noninstantiability with a private constructor
    private XJDataSimpleUtils() {
        throw new AssertionError(); //避免不小心在类的内部调用构造器
    }

    public static XjSendDataSimple dataProcessing(Object[] data, String[] xAxis, String category) {

        XjSendDataSimple xjSendDataSimple = new XjSendDataSimple();
        List<String> list = new LinkedList<>();
        Map<String, Object> map = new HashMap<>();

        map.put("name", "人数");
        map.put("data", data);

        for (int i = 0; i < xAxis.length; i++) {
            list.add(xAxis[i]);
        }

        xjSendDataSimple.setTitle(category);
        xjSendDataSimple.setxAxis(list);
        xjSendDataSimple.setSeries(map);

        return xjSendDataSimple;
    }
}
