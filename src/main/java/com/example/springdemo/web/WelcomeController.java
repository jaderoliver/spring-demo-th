package com.example.springdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author willesreis
 */
@Controller
public class WelcomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/test")
    public ModelAndView welcome() {
        ModelAndView view = new ModelAndView("welcome");
        view.addObject("message", "Hello World!");
        return view;
    }

}
