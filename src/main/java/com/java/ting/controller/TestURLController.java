package com.java.ting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestURLController {
    @RequestMapping(value = "/front/index")
    public String data(){
        return "index";
    }
}
