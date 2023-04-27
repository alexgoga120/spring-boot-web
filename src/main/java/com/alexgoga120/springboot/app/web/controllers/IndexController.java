package com.alexgoga120.springboot.app.web.controllers;

import com.alexgoga120.springboot.app.web.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"", "/", "/home", "/index"})
    public String index(Model model) {
        model.addAttribute("titulo", "hello spring");
        return "index/index";
    }
    @GetMapping("/profile")
    public String profile(Model model) {
        User user = new User();
        user.setName("Alex");
//        user.setLastname("Gomez");
        model.addAttribute("titulo", "Profile page");
        model.addAttribute("user", user);
        return "profile/index";
    }
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("titulo", "list page");
        return "profile/list";
    }

    @ModelAttribute("users")
    public List<User> fillUsers(){

        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("name " + i );
            user.setLastname("lastname " + i);
            users.add(user);
        }
        return users;
    }
}
