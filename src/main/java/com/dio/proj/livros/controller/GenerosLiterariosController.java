package com.dio.proj.livros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dio.proj.livros.model.GenerosLiterarios;
import com.dio.proj.livros.service.GenerosLiterariosService;

@RequestMapping(path = "/generos")
public class GenerosLiterariosController {
    @Autowired
    private GenerosLiterariosService generosLiterariosService;

    @GetMapping
    public ResponseEntity getGeneros(){
        return ResponseEntity.ok(generosLiterariosService.getAllGenerosLiterarios());
    }

    @PostMapping
    public ResponseEntity postGenero(@RequestBody GenerosLiterarios generoLiterarios){
        generosLiterariosService.addGenerosLiterarios(generoLiterarios);
        return ResponseEntity.ok(generosLiterariosService.getAllGenerosLiterarios());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity getGeneroEspecifico(@PathVariable(value = "id") Integer id){
        return ResponseEntity.ok(generosLiterariosService.getGeneroLiterarioById(id));
    }
}
