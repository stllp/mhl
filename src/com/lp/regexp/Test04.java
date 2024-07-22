package com.lp.regexp;

import org.junit.Test;

import java.util.regex.Pattern;

public class Test04 {
    @Test
    public void test(){
        String content="695539738@qq.com";
//        String regexp="\\.";
//        String s = Pattern.compile(regexp).matcher(content).replaceAll("");
//        System.out.println(s);
//        //内部反向引用 \\1   外部反向引用 $1
//        String s1 = Pattern.compile("(.)\\1+").matcher(s).replaceAll("$1");
//        System.out.println(s1);
        boolean matches = content.matches("^[\\w-]+@([a-zA-Z]+\\.)[a-zA-Z]+");
        System.out.println(matches);
    }
}
