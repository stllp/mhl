package com.lp.regexp;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test02 {
    @Test
    public void test() {
        String str = "https://www.bilibili.com/video/BV1fh411y7R8?p=894&spm_id_from=pageDriver&vd_source=970f89f07775ef44aab03e46d90eaf01";
        str ="https://www.baidu.com/s?wd=ddr4%E5%92%8Cddr5%E7%9A%84%E6%80%A7%E8%83%BD%E5%B7%AE%E8%B7%9D&rsv_spt=1&rsv_iqid=0x91fb43560018" +
                "181d&issp=1&f=3&rsv_bp=1&rsv_idx=2&ie=utf-8&tn=85070231_5_hao_pg&rsv_enter=1&rsv_dl=ts_0&rsv_sug3=17&rsv_sug1=10&rsv_sug7=" +
                "100&rsv_sug2=1&rsv_btype=i&prefixsug=ddr4&rsp=0&inputT=10170&rsv_sug4=10907";
        String  regexp = "^((https|http)://)([\\w]+\\.)[\\w-?/%&=.]+$";
        boolean matches = Pattern.matches(regexp, str); //校验是否满足规则
        System.out.println(matches);
        String replace = str.replace("http", "xxx");
        System.out.println(replace);
    }
}
