package com.example.cctread.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: caic
 * @Date: 2018/9/4 17:30
 * @Description:
 * @Version: 1.0
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
