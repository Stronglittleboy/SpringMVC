package com.colltrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 该类是为了测试@CookieValue
 */

@Controller
public class SpringmvcTest {
    @RequestMapping("/getcook")
    public String test01(@CookieValue("JSESSIONID") String cookie){
        System.out.println(cookie);
        return null;
    }
    /*获取网[pping("/gerhander")
    public String tetHeader(@RequestHeader("User-Agent")String parame){
        System.out.println(parame);
        return "show";
    }()
    /*路径获取参数*/
    @RequestMapping("/pathparam/{id}/{name}")
    public String getpathparam(@PathVariable(value = "id")String id,
                               @PathVariable(value = "name")String name){
        System.out.println(id+":"+name);
        return null;
    }
/*精准访问设置，对于访问路径，前台提交数据方式限制，以及限制参数设置
* 通过参数路径获取参数的时候，会覆盖直接参数
* */
    @RequestMapping(value = "/precise/{id}/{cid}",method= RequestMethod.GET, params={"id=5","cid=6"})
    public String preciseReq(@PathVariable("id")int id,
                             @PathVariable("cid")int cid){
        System.out.println(id);
        System.out.println("精准请求");
        return  null;
    }

}
