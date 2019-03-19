package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetDateTime {

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

    private GetDateTime() {
    }

    public static String now() {
        LocalDateTime ldt = LocalDateTime.now();

        return ldt.format(dtf);
    }
}
