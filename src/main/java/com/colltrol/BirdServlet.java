package com.colltrol;

import com.bean.Bird;
import com.service.BirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@SessionAttributes({"color","a2"})
@Controller

public class BirdServlet {
    @Autowired
    private BirdService service;

   /* public String toshow(HttpServletRequest req){
        System.out.println(req.getParameter("name"));
        return "show";
    }*/
   @RequestMapping("/foward")
   public ModelAndView toshow(Bird b){
        ModelAndView mav = new ModelAndView();
       System.out.println(b);
       mav.setViewName("show");
       mav.addObject("bird",b);
        return mav;
    }
    @RequestMapping("/test2")
    public String de(@RequestParam(name = "color",defaultValue = "abc")String big,
                     int age,String shape
                     ){
        System.out.println(big);
        System.out.println(age);
        System.out.println(shape);
        return "show";
    }
    @ExceptionHandler
    public String ex(){
       //日志记录异常
        System.out.println("出现异常");
        return"erro";
    }

        @RequestMapping("/store")
        public String stored(HttpServletRequest request, HttpSession session, ModelMap map){
            /*session.setAttribute("color","red");*/
            request.setAttribute("age","200");
            /*modelMap存值两种方式put，addAttribute4*/
            map.put("color","yellow");
            request.getServletContext().setAttribute("shape","big");
            return "EndPoing";
        }
        @RequestMapping("/tuichu")
        public String tuichud(HttpServletRequest request,HttpSession session,ModelMap map){
            String age = (String) request.getAttribute("age");
            System.out.println(age);
            String color = (String) session.getAttribute("color");
            System.out.println(color);
            session.invalidate();
            request.getServletContext().removeAttribute("shape");


            return "scopeshow";
        }
        @RequestMapping("/shanchu")
        public void shanchu(HttpSession session){

        }
}
