package com.bolsadeideas.springboot.errors.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerErrors {

    @GetMapping("/index")
    public String index(Model model) {
        //Linea para direccionar a template arithmetic
        //Integer number = 100 / 0;

        //Linea para direccionar a template numberFormat
        Integer number = Integer.parseInt("10asd");
        return "index";
    }
}
