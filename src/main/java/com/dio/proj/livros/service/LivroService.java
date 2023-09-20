package com.dio.proj.livros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.proj.livros.model.Livro;
import com.dio.proj.livros.repository.LivrosRepository;

@Service
public class LivroService {

    @Autowired
    private LivrosRepository livroRepo;

    public List<Livro> getAllLivros() {
        return livroRepo.findAll();
    }

    public Object getLivroById(Integer id) {
        return livroRepo.findById(id).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }

    public void addLivro(Livro livro) {
        livroRepo.save(livro);
    }

    public void deleteLivro(Integer id) {
        livroRepo.delete(livroRepo.findById(id).get());
    }

    public void updateLivro(Livro livro) {
        Livro livroParaSerAtualizado = livroRepo.findById(livro.getId()).get();
        livroParaSerAtualizado.setAutor(livro.getAutor());
        livroParaSerAtualizado.setTitulo(livro.getTitulo());
        livroParaSerAtualizado.setPreco(livro.getPreco());
        livroParaSerAtualizado.setQuantidade(livro.getQuantidade());
        livroRepo.save(livroParaSerAtualizado);
    }
    
}
