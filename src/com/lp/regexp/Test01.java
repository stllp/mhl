package com.lp.regexp;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@SuppressWarnings({"all"})

public class Test01 {
    @Test
    public void test() {
        String str = "121飒飒飒.2ass啊阿萨1212.都说了肯定是3345肯定是扣篮大赛ASASSAXZXZHJKAESNasklsdjfdwu2312323nxmzmasku";
        String  regexp = "(\\d\\d)(\\d\\d)";
        Pattern compile = Pattern.compile(regexp);
        Matcher matcher = compile.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group(0)); //取出全格式数据
            System.out.println(matcher.group(1)); //取出第一个分组 ()代表分组
            System.out.println(matcher.group(2)); //取出第二个分组

        }
    }
}
