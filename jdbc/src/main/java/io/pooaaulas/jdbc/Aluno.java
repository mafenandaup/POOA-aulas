package io.pooaaulas.jdbc;

import java.util.UUID;

public class Aluno {

    private UUID id;
    private String nome;
    private String matricula ;

    public Aluno(UUID id, String nome, String matricula) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
