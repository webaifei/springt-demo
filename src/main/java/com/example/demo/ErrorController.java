package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/error")
public class ErrorController {
    @RequestMapping("/error")
    public String error(ModelMap map) {
        int a = 1/0;
        map.addAttribute("name", "thymeleaf");
        return "thymeleaf/err";
    }
}
