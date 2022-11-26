package com.Thyem.ThymeleafProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.management.modelmbean.ModelMBean;

@Controller
public class Mycontroller {
    @RequestMapping(value = "/about" , method = RequestMethod.GET)
    public String about(Model model)
    {
        model.addAttribute("name","Sonu Choudhary");

        return  "about";
    }
}
