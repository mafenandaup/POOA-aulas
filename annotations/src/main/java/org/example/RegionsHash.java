package org.example;

import java.util.HashMap;

public class RegionsHash {

    private HashMap<Integer, String> mapaRegioes;

    public RegionsHash() {
        mapaRegioes = new HashMap<>();

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

}
