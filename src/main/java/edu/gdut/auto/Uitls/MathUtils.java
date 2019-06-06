package edu.gdut.auto.Uitls;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathUtils {
    /**
     * 判断字符串是否都为数字
     * 如果是数字就返回true
     *
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str.trim());
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }
}
