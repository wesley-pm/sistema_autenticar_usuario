package com.maraujo.oauthsocial;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class SocialLoginController {

    @GetMapping("/")
    public String getHomePage(){
        return "index";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

}
