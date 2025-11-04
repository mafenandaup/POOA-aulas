package org.example;

import static org.example.Validador.isCPF;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoaValida = new Pessoa("Maria Fernanda", "701.719.490-05", "Eu existo!" );
        Pessoa pessoaInvalida = new Pessoa("Jonatan", "111-111-111-11", "Eu não existo.");


        System.out.println(pessoaValida.toString() +"O cpf é válido? "+ isCPF(pessoaValida.cpf));
        System.out.println(pessoaInvalida.toString() +"O cpf é válido? "+  isCPF(pessoaInvalida.cpf));
        }
    }