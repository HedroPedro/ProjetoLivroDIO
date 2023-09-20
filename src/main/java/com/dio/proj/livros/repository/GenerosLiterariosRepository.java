package com.dio.proj.livros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.proj.livros.model.GenerosLiterarios;

@Repository
public interface GenerosLiterariosRepository extends JpaRepository<GenerosLiterarios, Integer>{
    
}
