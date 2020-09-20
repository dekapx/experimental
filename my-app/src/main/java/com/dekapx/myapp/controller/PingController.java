package com.dekapx.myapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CONFLICT;

@Slf4j
@RestController
@RequestMapping("/api")
public class PingController {
    @GetMapping(value = "/ping/{name}", produces = "application/json")
    public ResponseEntity<String> ping(
            @RequestParam(name = "name", defaultValue = "Test") String name) {
        log.info("PingController.ping({}) method invoked by id [{}]...", name);
        return new ResponseEntity<String>("Hello ! " + name, HttpStatus.OK);
    }

    @ExceptionHandler
    @ResponseStatus(CONFLICT)
    public String handleException(final Exception e) {
        return e.getMessage();
    }
}
