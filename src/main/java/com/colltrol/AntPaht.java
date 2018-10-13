package com.colltrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * create by: 天才梦浪
 * description:匹配Springmvc是否支持ant路径访问方式{*：匹配0以及多个字符，？：占位符：匹配一个，**：匹配多层的路径}
 * create time: 10:22 2018/10/13
 *
 */
@Controller
public class AntPaht {

    @RequestMapping("antask/?abc")
    public void antask(){
        System.out.println("ant?问号匹配测试");
    }
    @RequestMapping("antstar/*123")
    public void antstar(){
        System.out.println("ant*问号匹配测试");
    }
    @RequestMapping("**/doublestar")
    public void doublestar(){
        System.out.println("ant**问号匹配测试");
    }
}
