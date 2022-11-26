package com.Thyem.ThymeleafProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Conditional {
    @GetMapping("/condition")
    public String cond(Model model)
    {
        model.addAttribute("isActive",true);
        model.addAttribute("Gender","F");
        List<Integer> list= List.of(23,24,35,45,56);
        model.addAttribute("mylist",list);
        return "cond";
    }
}
