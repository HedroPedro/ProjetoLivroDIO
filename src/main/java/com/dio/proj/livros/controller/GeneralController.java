package com.dio.proj.livros.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {
    
    @GetMapping()
    public ResponseEntity welcomeGet(){
        return new ResponseEntity<>(HttpStatus.ACCEPTED).ok("Ola");
    }
}
