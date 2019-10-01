package com.example.springdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author willesreis
 */
@Controller
public class WelcomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }

    @GetMapping("/test")
    public ModelAndView welcome() {
        ModelAndView view = new ModelAndView("welcome");
        view.addObject("message", "Hello World!");
        return view;
    }

    @PostMapping("/test-encode")
    public ModelAndView encode(@RequestBody MultiValueMap<String, String> formData) {
        ModelAndView view = new ModelAndView("form");
        view.addObject("txtarea", formData.get("txtarea").get(0));
        return view;
    }

}
