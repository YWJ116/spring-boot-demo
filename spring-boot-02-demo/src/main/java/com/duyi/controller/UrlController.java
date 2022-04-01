package com.duyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UrlController {
    @GetMapping("/index")
    public String getIndex(Model model){
        model.addAttribute("name","bigsai");
        return "index";
    }
}
