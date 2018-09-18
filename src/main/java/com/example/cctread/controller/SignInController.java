package com.example.cctread.controller;

import com.example.cctread.domain.CctUser;
import com.example.cctread.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Auther: caic
 * @Date: 2018/9/6 15:17
 * @Description: 注册页面
 * @Version: 1.0
 */
@Controller
public class SignInController {
    @Autowired
    UserService userService;

    @GetMapping("/signIn")
    public String signIn(){
        return "/signIn";
    }

    @PostMapping("/signInUser")
    public String signInUser(CctUser cctUser){
        userService.signIn(cctUser);
        return "/login";
    }
}
