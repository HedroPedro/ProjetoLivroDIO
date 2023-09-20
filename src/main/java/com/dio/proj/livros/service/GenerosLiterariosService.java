package com.dio.proj.livros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.proj.livros.repository.GenerosLiterariosRepository;

@Service
public class GenerosLiterariosService{
    @Autowired
    private GenerosLiterariosRepository generosLiterariosRepo;

}