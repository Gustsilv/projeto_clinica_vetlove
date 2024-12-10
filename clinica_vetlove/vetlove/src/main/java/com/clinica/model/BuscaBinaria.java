package com.clinica.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BuscaBinaria {

    // Função de busca binária
    public static int buscaBinaria(ArrayList<Cliente> lista, String chave) {
        int esquerda = 0;
        int direita = lista.size() - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;  // Calcula o meio da lista

            // Compara a chave com o valor no meio da lista, pela ordem alfabética
            int comparacao = chave.compareToIgnoreCase(lista.get(meio).getNome_cliente());

            if (comparacao == 0) {
                // Se a chave for igual ao valor do meio, encontramos o elemento
                return meio;
            } else if (comparacao < 0) {
                // Se a chave for menor (alfabeticamente), descartamos a metade direita
                direita = meio - 1;
            } else {
                // Se a chave for maior (alfabeticamente), descartamos a metade esquerda
                esquerda = meio + 1;
            }
        }

        // Retorna -1 se a chave não for encontrada
        return -1;
    }

    public static void ordenarListaPeloNome(ArrayList<Cliente> lista){
        lista.sort(Comparator.comparing(Cliente::getNome_cliente));
    }

    public static void buscarPeloNome(ArrayList<Cliente> cadastro, String nome_procurado) {

        ordenarListaPeloNome(cadastro);

        // Chamando a função de busca binária
        int resultado = buscaBinaria(cadastro, nome_procurado);

        // Verificando o resultado
        if (resultado != -1) {
            System.out.println("O cliente \"" + nome_procurado + "\" foi encontrado: ");
            System.out.println(cadastro.get(resultado).exibir());
            cadastro.get(resultado).exibe_pets();
        } else {
            System.out.println("O cliente \"" + nome_procurado + "\" não foi encontrado.");
        }
    }
}
