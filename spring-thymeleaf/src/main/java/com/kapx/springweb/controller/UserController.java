package com.kapx.springweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CONFLICT;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/login", method = GET)
    public String login(@RequestParam(value="name", required=false, defaultValue="World") final String name, final Model model) {
        model.addAttribute("name", name);
        return "dashboard";
    }

    @RequestMapping(value = "/ping", method = GET)
    public String ping() {
        LOGGER.info("--- User Service REST Controller ping method invoked. ---");
        return "User Service REST Controller";
    }

    @ExceptionHandler
    @ResponseStatus(CONFLICT)
    public String handleException(Exception e) {
        return e.getMessage();
    }
}
