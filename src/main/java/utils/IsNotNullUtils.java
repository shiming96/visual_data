package utils;

public class IsNotNullUtils {

    //Enforce noninstantiability with a private constructor
    private IsNotNullUtils() {
        throw new AssertionError(); //避免不小心在类的内部调用构造器
    }

    /**
     * 判断该字符串是否为空
     * @param s
     * @return
     */
    public static boolean isEmptyStr(String s) {
        boolean result = false;
        if("".equals(s))
            result = true;
        return result;
    }

    /**
     * 判断字符串是否为null
     * @param s
     * @return
     */
    public static boolean isNullStr(String s) {
        boolean result = false;
        if(null == s)
            result = true;
        return result;
    }

    public static boolean isNullObj(Object o) {
        boolean result = false;
        if(null == o)
            result = true;
        return result;
    }



}
