package utils;

import java.math.BigDecimal;

public class MathUtil {

    //Enforce noninstantiability with a private constructor
    private MathUtil() {
        throw new AssertionError(); //避免不小心在类的内部调用构造器
    }

    /**
     * a / b   计算百分比
     * @param a
     * @param b
     * @return eg:65.32%
     */
    public static String ADivideBPercent(BigDecimal a, BigDecimal b){
        String percent =
                b == null ? "-" :
                        b.compareTo(new BigDecimal(0)) == 0 ? "-":
                                a == null ? "0.00%" :
                                        a.multiply(new BigDecimal(100)).divide(b,2,BigDecimal.ROUND_HALF_UP) + "%";
        return percent;
    }

}
