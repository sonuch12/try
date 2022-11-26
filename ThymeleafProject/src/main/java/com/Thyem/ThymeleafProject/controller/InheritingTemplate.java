package com.Thyem.ThymeleafProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InheritingTemplate {
    @GetMapping("/inherit")
    public String inherit(Model model)
    {
        return "base";
    }
}
