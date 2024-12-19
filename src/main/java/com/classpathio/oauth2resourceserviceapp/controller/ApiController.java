package com.classpathio.oauth2resourceserviceapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/public")
    public String publicEndPoint(){
        return "This is a public endpoint";
    }

    @GetMapping("/private")
    public String privateEndPoint(){
        return "This is a private endpoint and need scope 'read' to access it";
    }
}
