package com.codegym.cms.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
    @GetMapping("/")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("/home/index");
        return modelAndView;
    }
}
