package com.ayra.userauth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @GetMapping("/hello")
    ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello World");
    }
}
