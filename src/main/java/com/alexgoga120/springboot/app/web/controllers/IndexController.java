package com.alexgoga120.springboot.app.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"", "/", "/home", "/index"})
    public String index(Model model) {
        model.addAttribute("titulo", "hello spring");
        return "index/index";
    }
}
