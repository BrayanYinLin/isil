package com.yinlin.isil.controller;

import com.yinlin.isil.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    ShopRepository shopRepository;

    @GetMapping("/search")
    public String search() {
        return "";
    }

    @GetMapping("/new")
    public String routeToNew() {
        return "newShop";
    }
}
