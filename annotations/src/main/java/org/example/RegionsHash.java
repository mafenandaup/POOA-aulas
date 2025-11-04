package org.example;

import java.util.HashMap;

public class RegionsHash {

    private String cpf;
    private static HashMap<Integer, String> mapaRegioes = new HashMap<>();
    public RegionsHash() {
        HashMap<Integer, String> mapaRegioes = new HashMap<>();

        mapaRegioes.put(0, "Rio Grande do Sul");
        mapaRegioes.put(1, "Distrito Federal, Goiás, Mato Grosso, Mato Grosso do Sul e Tocantins");
        mapaRegioes.put(2, "Pará, Amazonas, Acre, Amapá, Rondônia e Roraima");
        mapaRegioes.put(3, "Ceará, Maranhão e Piauí");
        mapaRegioes.put(4, "Pernambuco, Rio Grande do Norte, Paraíba e Alagoas");
        mapaRegioes.put(5, "Bahia e Sergipe");
        mapaRegioes.put(6, "Minas Gerais");
        mapaRegioes.put(7, "Rio de Janeiro e Espírito Santo");
        mapaRegioes.put(8, "São Paulo");
        mapaRegioes.put(9, "Paraná e Santa Catarina");
    }

    public static String matchRegions(String cpf){
        char digitoRegiaoChar = cpf.charAt(8);
        int digitoRegiao = Character.getNumericValue(digitoRegiaoChar);

        // Busca a região no mapa
        if (mapaRegioes.containsKey(digitoRegiao)){
            System.out.println( mapaRegioes.get(digitoRegiao));
            return mapaRegioes.get(digitoRegiao);
        } else {
            return "região desconhecida: " + digitoRegiao;
        }
    }

}
