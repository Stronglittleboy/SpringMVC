package com.colltrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * create by: 天才梦浪
 * description:测试RESTful框架的传值以及访问方式
 * create time: 10:44 2018/10/13
 *
 */
@Controller
public class RESTful {
    @RequestMapping(value = "RESTfulPut",method = RequestMethod.PUT)
        public void RESTPut(String id){
        System.out.println("测试PUt方式"+id);
    }

}
