package org.example;
import org.example.RegionsHash;


public class Validador {


    public static boolean isCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");

        //valida se tem todos os dígitos pós regex
        if (cpf.length() != 11) {
            System.out.println("CPF inválido.");
            return false;
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            System.out.println("CPF inválido (todos os dígitos iguais).");
            return false;
        }

        if (!calcValidacao(cpf)) {
            System.out.println("CPF inválido.");
            return false;
        }

        RegionsHash.matchRegions(cpf);

        return  true;
    }



    private static Boolean calcValidacao(String cpf){
        int[] estrutura = new int[11];
        for (int i = 0; i < 11; i++) {
            estrutura[i] = Character.getNumericValue(cpf.charAt(i));
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += estrutura[i] * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito > 9) primeiroDigito = 0;

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += estrutura[i] * (11 - i);
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito > 9) segundoDigito = 0;

        // Comparar com os dígitos originais
        return (primeiroDigito == estrutura[9]) && (segundoDigito == estrutura[10]);
    }
}

