package com.colltrol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * create by: 天才梦浪
 * description:测试RESTful框架的传值以及访问方式
 * create time: 10:44 2018/10/13
 */
@Controller
public class RESTful {
    private final Logger log = LoggerFactory.getLogger(RESTful.class);
    @PutMapping(value = "RESTfulPut")
    public void restPut(String id) {
        log.info("测试PUt方式:{}", id);
    }
}
