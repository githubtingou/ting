package com.java.ting.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestURLController {
    @RequestMapping(value = "web/index")
    public String data(){
        return "index";
    }
}
