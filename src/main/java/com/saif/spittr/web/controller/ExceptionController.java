package com.saif.spittr.web.controller;

import com.saif.spittr.web.exceptions.DuplicateSpittleException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(DuplicateSpittleException.class)
    public String handleDuplicateSpittleException() {
        return "redirect:/error/duplicate";
    }
}
