package com.duyi.controller;

import com.duyi.bean.Food;
import com.duyi.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
    @Autowired
    private FoodConfig food;
    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;

    @RequestMapping("/food")
    public Food food(){
        System.out.println(666);
        return new Food(food.getMeat(),food.getRice(),food.getSauce());
    }
    @RequestMapping("/jasypt")
    public String jasypt(){
        StringBuffer buffer = new StringBuffer();
        buffer.append(username);
        buffer.append("---");
        buffer.append(password);
        return buffer.toString();
    }
}
