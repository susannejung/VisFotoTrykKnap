package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UIcontroller {


 @GetMapping("/greeting")
 public String greeting(@RequestParam(name = "name", required = false, defaultValue = "Ragdoll Fans") String name, Model model) {
    User u = new User("Lau");
    u.billednavn = "bowie.jpg";
    model.addAttribute("name", u);
    return "greeting";
 }
}

