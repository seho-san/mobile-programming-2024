package com.example.demo12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    private String name;
    private Model model;

    @GetMapping(value = "/test")
    public String test() {
        return "test";
    }

    @GetMapping(value = "/param1")
    public String Kimseho(@RequestParam("name") String name, Model model) {
        model.addAttribute("data", "데이터 수신");
        model.addAttribute("username", name);
        return "/thymeleaf/param1";
    }
    @GetMapping(value = "/param2")
    public String dtoexample(ItemDTO kimseho, Model model) {
        model.addAttribute("data", "데이터 수신");
        model.addAttribute("username", name);
        return "/thymeleaf/param2";
    }
}
