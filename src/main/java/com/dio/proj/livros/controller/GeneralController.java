package com.dio.proj.livros.controller;

import javax.swing.text.html.parser.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dio.proj.livros.model.GenerosLiterarios;
import com.dio.proj.livros.model.Livro;
import com.dio.proj.livros.service.LivroService;

@RestController
public class GeneralController {

    @Autowired
    private LivroService livroService;
    
    @GetMapping()
    public ResponseEntity<Object> welcomeGet() {
        return ResponseEntity.ok("Ola");
    }

    @GetMapping(path = "/livros")
    public ResponseEntity<Object> getLivros() {
        return ResponseEntity.ok(livroService.getAllLivros());
    }
    
    @PostMapping(path = "/livros")
    public ResponseEntity<Object> addLivro(@RequestBody Livro livro) {
        livroService.addLivro(livro);        
        return ResponseEntity.ok("Livro: " + livro.getTitulo() + " adicionado com sucesso");
    }

    @GetMapping(path = "/livros/{id}")
    public ResponseEntity<Object> getLivroById(@PathVariable(value = "id") Integer id) {
        return ResponseEntity.ok(livroService.getLivroById(id));
    }

    @DeleteMapping(path = "/livros/{id}")
    public ResponseEntity<Object> deleteLivro(@PathVariable(value = "id") Integer id) {
        livroService.deleteLivro(id);        
        return ResponseEntity.ok("Livro deletado");
    }

    @PatchMapping(path = "/livros")
    public ResponseEntity<Object> updateLivroUsingId(@RequestBody Livro livro) {
        livroService.updateLivro(livro);
        return ResponseEntity.ok("Livro atualizado");

    }
}
