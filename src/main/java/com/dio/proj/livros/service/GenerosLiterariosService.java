package com.dio.proj.livros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.proj.livros.controller.GenerosLiterariosController;
import com.dio.proj.livros.model.GenerosLiterarios;
import com.dio.proj.livros.repository.GenerosLiterariosRepository;

@Service
public class GenerosLiterariosService{
    @Autowired
    private GenerosLiterariosRepository generosLiterariosRepo;

    public List<GenerosLiterarios> getAllGenerosLiterarios() {
        return generosLiterariosRepo.findAll();
    }

    public void addGenerosLiterarios(GenerosLiterarios generoLiterarios) {
        generosLiterariosRepo.save(generoLiterarios);
    }

    public GenerosLiterarios getGeneroLiterarioById(Integer id) {
        return generosLiterariosRepo.findById(id).orElseThrow(() -> new RuntimeException("Não foi encontrado pelo id"));
    }

}