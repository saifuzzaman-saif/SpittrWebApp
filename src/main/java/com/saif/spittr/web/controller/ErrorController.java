package com.saif.spittr.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/error")
public class ErrorController {

    private static final String ERROR_PAGE = "errorView";

    @RequestMapping(method = GET, value = "/duplicate")
    public String showError() {
        return ERROR_PAGE;
    }
}
