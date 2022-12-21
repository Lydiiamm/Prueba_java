package com.javaproyect.shopLydia.controller;

import com.javaproyect.shopLydia.entity.Address;
import com.javaproyect.shopLydia.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouterController {
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("client", new Customer());
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new Customer());
        return "register";
    }
    @GetMapping("/address")
    public String addAddress(Model model) {
        model.addAttribute("address", new Address());
        return "address";
    }

}
