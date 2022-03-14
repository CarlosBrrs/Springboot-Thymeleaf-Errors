package com.bolsadeideas.springboot.errors.app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

//Esta anotación maneja errores, excepciones. Aqui se mapean a excepciones, que van a un método
@ControllerAdvice
public class ControllerErrorHandler {

    @ExceptionHandler(ArithmeticException.class)
    public String arithmeticError(Exception e, Model model) {
        model.addAttribute("errorMsg", "¡¡¡Arithmetic error!!!");
        model.addAttribute("message", e.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
        return "error/arithmetic";
    }

    @ExceptionHandler(NumberFormatException.class)
    public String numberFormatError(Exception e, Model model) {
        model.addAttribute("errorMsg", "¡¡¡Number format error!!!");
        model.addAttribute("message", e.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
        return "error/number-format";
    }

}
