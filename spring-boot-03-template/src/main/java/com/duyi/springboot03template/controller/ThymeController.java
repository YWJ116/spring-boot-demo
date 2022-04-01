package com.duyi.springboot03template.controller;

import com.duyi.springboot03template.bean.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ThymeController {
    @RequestMapping("/thyme")
    public String index(Model model){
//        model.addAttribute("now",new Date().toString());
//        model.addAttribute("name","thymeleaf");
        Restaurant restaurant = new Restaurant();
        restaurant.setBoss("黄晓明");
        restaurant.setChef("林大厨");
        model.addAttribute("restaurant",restaurant);
        return "thymeleaf/index.html";
    }
}
