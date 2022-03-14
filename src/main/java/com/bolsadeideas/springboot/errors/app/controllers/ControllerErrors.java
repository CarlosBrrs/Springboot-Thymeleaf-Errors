package com.bolsadeideas.springboot.errors.app.controllers;

import com.bolsadeideas.springboot.errors.app.errors.UserNotFoundException;
import com.bolsadeideas.springboot.errors.app.models.domain.User;
import com.bolsadeideas.springboot.errors.app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControllerErrors {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String index(Model model) {
        //Linea para direccionar a template arithmetic
        //Integer number = 100 / 0;

        //Linea para direccionar a template numberFormat
        Integer number = Integer.parseInt("10asd");
        return "index";
    }

    @GetMapping("/user/{id}")
    public String getUser (@PathVariable Integer id, Model model) {
        User user = userService.findUserById(id);

        //Si user me retorna null, capturaré y lanzaré el error a través de una clase personalizada UserNotFoundException
        if (user == null) throw new UserNotFoundException(id.toString());

        model.addAttribute("title", "User detail: ".concat(user.getName()));
        model.addAttribute("user", user);
        return "user";
    }
}
