package com.Thyem.ThymeleafProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class SecondController {
    @RequestMapping(value = "/iterate",method = RequestMethod.GET)
    public String iter(Model model)
    {
        List<String> names = List.of("Sonu", "Monu", "Gonu", "Ponu");
        model.addAttribute("n",names);
        return "list";
    }
}
