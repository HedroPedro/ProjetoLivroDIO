package com.dio.proj.livros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.proj.livros.model.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Integer>{
    
}
