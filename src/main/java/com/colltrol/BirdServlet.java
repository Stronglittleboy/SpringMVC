package com.colltrol;

import com.bean.Bird;
import com.service.BirdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes({"color", "a2"})
public class BirdServlet {
    @Autowired
    private BirdService service;
    private final Logger log = LoggerFactory.getLogger(BirdServlet.class);
    @RequestMapping("/foward")
    public ModelAndView toshow(Bird b) {
        ModelAndView mav = new ModelAndView();
        log.info(String.valueOf(b));
        mav.setViewName("show");
        mav.addObject("bird", b);
        return mav;
    }

    @RequestMapping("/test2")
    public String de(@RequestParam(name = "color", defaultValue = "abc") String big,
                     int age, String shape
    ) {
        log.info(big);
        log.info("结果：{}", age);
        log.info(shape);
        return "show";
    }

    @ExceptionHandler
    public String ex() {
        //日志记录异常
        log.info("出现异常");
        return "erro";
    }

    @RequestMapping("/store")
    public String stored(HttpServletRequest request, HttpSession session, ModelMap map) {
        request.setAttribute("age", "200");
        /*modelMap存值两种方式put，addAttribute4*/
        map.put("color", "yellow");
        request.getServletContext().setAttribute("shape", "big");
        return "EndPoing";
    }

    @RequestMapping("/tuichu")
    public String tuichud(HttpServletRequest request, HttpSession session, ModelMap map) {
        String age = (String) request.getAttribute("age");
        log.info(age);
        String color = (String) session.getAttribute("color");
        log.info(color);
        session.invalidate();
        request.getServletContext().removeAttribute("shape");


        return "scopeshow";
    }

    @PostMapping(value = "/goodbye")
    public String goodbye(SessionStatus status) {
        status.setComplete();
        return "GoodBye";
    }
}
