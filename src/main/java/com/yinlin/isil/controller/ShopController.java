package com.yinlin.isil.controller;

import com.yinlin.isil.entity.PartnerEntity;
import com.yinlin.isil.entity.ShopEntity;
import com.yinlin.isil.repository.PartnerRepository;
import com.yinlin.isil.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    ShopRepository shopRepository;

    @Autowired
    PartnerRepository partnerRepository;

    @GetMapping("")
    public String shops(Model model) {
        List<ShopEntity> shops = shopRepository.findAll();
        model.addAttribute("shops", shops);
        return "shops";
    }

    @GetMapping("/search")
    public String search(@RequestParam("distrit") String distrit, Model model) {
        List<ShopEntity> shops = shopRepository.findByDistritContains(distrit);
        model.addAttribute("shops", shops);
        return "shops";
    }

    @GetMapping("/new")
    public String routeToNew(Model model) {
        List<PartnerEntity> list = partnerRepository.findAll();
        model.addAttribute("shop", new ShopEntity());
        model.addAttribute("bosses", list);
        return "newShop";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("shop") ShopEntity shop) {
        shopRepository.save(shop);
        return "redirect:/home/main";
    }
}
