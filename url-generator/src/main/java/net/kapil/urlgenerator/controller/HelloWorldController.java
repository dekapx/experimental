package net.kapil.urlgenerator.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
    public String home() {
        return "Hello World!";
    }
}
