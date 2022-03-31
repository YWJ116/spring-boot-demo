package com.duyi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VegetablesController {
    @RequestMapping("/vegetables")
    public String vegetables(){
        return "hello vegetables";
    }
}
