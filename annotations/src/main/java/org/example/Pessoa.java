package org.example;
import org.example.Validacao;


public class Pessoa {
    @Validacao(descricao = "nome")
    protected String nome;

    @Validacao(descricao = "cpf")
    protected String cpf;

    @Validacao(descricao = "mensagem")
    protected String saudacao;

    public Pessoa(String nome, String cpf, String saudacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.saudacao = saudacao;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", saudacao='" + saudacao + '\'' +
                '}';
    }
}
