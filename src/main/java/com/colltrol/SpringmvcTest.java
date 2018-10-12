package com.colltrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
