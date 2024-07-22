package com.lp.regexp;

import org.junit.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.regex.Pattern;

public class Test03 {
    /**
     * 结巴去重案例
     */
    @Test
    public void test(){
        String content="我....要..要....学学学学....java！";
        String regexp="\\.";
        String s = Pattern.compile(regexp).matcher(content).replaceAll("");
        System.out.println(s);
        //内部反向引用 \\1   外部反向引用 $1
        String s1 = Pattern.compile("(.)\\1+").matcher(s).replaceAll("$1");
        System.out.println(s1);
    }
}

