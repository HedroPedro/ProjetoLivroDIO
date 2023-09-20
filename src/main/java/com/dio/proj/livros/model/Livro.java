package com.dio.proj.livros.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_livros")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "livro_id", nullable = false)
    private Integer id;

    @Column(name = "livro_titulo", nullable = false, length = 50, unique = true)
    private String titulo;
    @Column(name = "livro_autor", nullable = false)
    private String autor;
    @Column(name = "livro_preco", nullable = false)
    private Float preco;
    @Column(name = "livro_qtd", nullable = false, length = Integer.MAX_VALUE)
    private Integer quantidade;

    @OneToOne
    private GenerosLiterarios generoLiterario;

}
