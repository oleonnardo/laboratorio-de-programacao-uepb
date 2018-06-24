/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import Classes.Funcoes;

/**
* @Aluno: Leonardo Araujo Silva
* @Matrícula: 161080120
*/

public class QuickSort {

    public static void run(int[] vetor) {
        long inicio = System.currentTimeMillis();
        quicksort(vetor, 0, (vetor.length - 1));
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        double t = tempo/Funcoes.divisor;
        Funcoes.print(inicio, fim, t, "Quick Sort", vetor.length);
    }

     public static int[] quicksort(int vet[], int ini, int fim) {
        int meio;
        if (ini < fim) {
            meio = partition(vet, ini, fim);
            quicksort(vet, ini, meio);
            quicksort(vet, meio + 1, fim);
        }
        return vet;
    }

 

    public static int partition(int vet[], int ini, int fim) {
        int pivo, topo, i;
        pivo = vet[ini];
        topo = ini;
        
        for (i = ini + 1; i <= fim; i++) {
            if (vet[i] < pivo) {
                vet[topo] = vet[i];
                vet[i] = vet[topo + 1];
                topo++;
            }
        }

        vet[topo] = pivo;
        return topo;

    }

}
