package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/api")
public class SimpleController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/public")
    public String getPublicResource(HttpServletRequest httpServletRequest){
        return "This is a public resource" + new Date().toString();
    }

    @GetMapping("/private")
    public String getPrivateResource(Model model){
        return "This is a private resource" + new Date().toString();
        //return "users-overview";

    }

    @GetMapping("/private/test")
    public String getPrivateTestResource(){
        return "This is a private resource from Test" + new Date().toString();
    }


}
