package com.dio.proj.livros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.proj.livros.model.Livro;
import com.dio.proj.livros.service.GenerosLiterariosService;
import com.dio.proj.livros.service.LivroService;

@RestController
@RequestMapping(path = "/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @Autowired
    private GenerosLiterariosService generosLiterariosService;

    @GetMapping
    public ResponseEntity getLivros() {
        return ResponseEntity.ok(livroService.getAllLivros());
    }
    
    @PostMapping
    public ResponseEntity addLivro(@RequestBody Livro livro) {
        livro.setGeneroLiterario(generosLiterariosService.getGeneroLiterarioById(livro.getGeneroLiterario().getId()));
        livroService.addLivro(livro);        
        return ResponseEntity.ok("Livro: " + livro.getTitulo() + " adicionado com sucesso");
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity getLivroById(@PathVariable(value = "id") Integer id) {
        return ResponseEntity.ok(livroService.getLivroById(id));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity deleteLivro(@PathVariable(value = "id") Integer id) {
        livroService.deleteLivro(id);        
        return ResponseEntity.ok("Livro deletado");
    }

    @PatchMapping
    public ResponseEntity updateLivroUsingId(@RequestBody Livro livro) {
        livro.setGeneroLiterario(generosLiterariosService.getGeneroLiterarioById(livro.getGeneroLiterario().getId()));
        livroService.updateLivro(livro);
        return ResponseEntity.ok("Livro atualizado");
    }
}
