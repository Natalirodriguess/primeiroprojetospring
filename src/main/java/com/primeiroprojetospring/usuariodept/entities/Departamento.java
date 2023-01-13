package com.primeiroprojetospring.usuariodept.entities;

public class Departamento {

    private Long id;
    private String nome;

    public Departamento() {

    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
