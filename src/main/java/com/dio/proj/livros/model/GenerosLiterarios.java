package com.dio.proj.livros.model;

import org.hibernate.annotations.ValueGenerationType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "tb_generosLiterarios")
@Data
public class GenerosLiterarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "generosLiterarios_id")
    private Integer id;

    @Column(name = "generosLiterarios_name", length = 50, nullable = false)
    private String name;
}
