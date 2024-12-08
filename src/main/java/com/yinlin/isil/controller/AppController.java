package com.yinlin.isil.controller;

import com.yinlin.isil.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class AppController {
    @GetMapping("/recover")
    public String routeToHome(Model model) {
        model.addAttribute("user", new UserEntity());
        return "recoverPassword";
    }

    @GetMapping("/main")
    public String routeToMain() {
        return "main";
    }
}
