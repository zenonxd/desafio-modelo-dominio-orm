package com.devsuperior.desafiomodelodominioorm.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_atividade")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String descricao;
    private Double preco;

    public Atividade() {}

    public Atividade(Integer id, String name, String descricao, Double preco) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;
        this.preco = preco;
    }
}
