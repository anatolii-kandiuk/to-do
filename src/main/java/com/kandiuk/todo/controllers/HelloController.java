package com.kandiuk.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(Model model, String name) {
        name = "Anatolii";
        model.addAttribute("name", name);
        return "sayHello";
    }
}
