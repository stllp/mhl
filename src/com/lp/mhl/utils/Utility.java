package com.lp.mhl.utils;

import java.util.Scanner;

public class Utility {
    /***
     * 获取输键盘入字符串
     * @param num  截取多少数据字符
     * @return
     */
    public static String getString(int num) {
        String substring = null;
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if (next.length() <= num) {
            substring = next.substring(0, next.length());
        } else {
            substring = next.substring(0, num);
        }

        return substring;
    }
}
