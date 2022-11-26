package com.Thyem.ThymeleafProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Fragment {
    @GetMapping("/include")
    public String include(Model model)
    {
        model.addAttribute("title","Welcome");
        model.addAttribute("subtitle","Java language");
        return "service";
    }
}
