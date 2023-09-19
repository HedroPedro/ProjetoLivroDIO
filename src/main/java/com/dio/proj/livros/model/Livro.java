package com.dio.proj.livros.model;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "tb_livros")
@Data
@AllArgsConstructor
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "livro_id", nullable = false)
    private Integer id;

    @Column(name = "livro_titulo", nullable = false)
    private String titulo;
    private String autor;
    private Float preco;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "livro_generosLiterarios_id")
    private List<GenerosLiterarios> generosLiterarios;
}
