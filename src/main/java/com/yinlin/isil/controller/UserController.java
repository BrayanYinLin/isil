package com.yinlin.isil.controller;

import com.yinlin.isil.entity.UserEntity;
import com.yinlin.isil.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/auth")
    public String auth(@RequestParam("email") String email, @RequestParam("password") String password) {
        UserEntity authenticatedUser = userRepository.findByEmailAndPassword(email, password);

        if (authenticatedUser != null) {
            return "redirect:/home/main";
        } else {
            return "error";
        }
    }

    @PostMapping("/recover")
    public String recover (@ModelAttribute("user") UserEntity user) {
        UserEntity targetUser = userRepository.findByEmail(user.getEmail());

        if (targetUser == null) {
            return "redirect:/home/main";
        }

        targetUser.setPassword(user.getPassword());
        userRepository.save(targetUser);

        return "redirect:/";
    }
}
