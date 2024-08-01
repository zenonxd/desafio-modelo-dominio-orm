package com.devsuperior.desafiomodelodominioorm.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToMany(mappedBy = "atividades")
    private Set<Participante> participantes = new HashSet<>();

    @ManyToOne
    private Bloco bloco;

    public Atividade() {}

    public Atividade(Integer id, String name, String descricao, Double preco) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;
        this.preco = preco;
    }
}
