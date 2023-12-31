package com.dio.proj.livros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.proj.livros.model.Livro;

@Repository
public interface LivrosRepository extends JpaRepository<Livro, Integer>{

}
