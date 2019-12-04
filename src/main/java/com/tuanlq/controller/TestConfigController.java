package com.tuanlq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestConfigController {
    @GetMapping("")
    public String testConfig(){
        return "test";
    }

}
