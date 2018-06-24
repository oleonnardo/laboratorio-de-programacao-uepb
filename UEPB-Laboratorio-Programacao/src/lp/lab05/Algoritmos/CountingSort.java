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

public class CountingSort {

    public static void run(int[] vetor) {
        long inicio = System.currentTimeMillis();
        countingsort(vetor);
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        double t = (double) tempo / Funcoes.divisor;
        Funcoes.print(inicio, fim, t, "Counting Sort", vetor.length);
    }

    private static void countingsort(int[] vetor) {

        // array a ser ordenado, este array é necessário
        // quando ordenamos tipos de dados de objetos, se não
        // podemos classificar diretamente no array de entrada
        int[] aux = new int[vetor.length];

        // encontre o menor e o maior valor
        int min = vetor[0];
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];
            } else if (vetor[i] > max) {
                max = vetor[i];
            }
        }

        // matriz de frequências init
        int[] counts = new int[max - min + 1];

        // inicie as freqüências
        for (int i = 0; i < vetor.length; i++) {
            counts[vetor[i] - min]++;
        }

        // recalcule o array - crie o array de ocorrências
        counts[0]--;
        for (int i = 1; i < counts.length; i++) {
            counts[i] = counts[i] + counts[i - 1];
        }

        /*
            Classifique a matriz à direita
            1) Procure na matriz de ocorrências a última ocorrência do valor dado
            2) Coloque-o no array ordenado
            3) Decrementar o índice da última ocorrência do valor dado
            4) Continue com o valor anterior da matriz de entrada (goto set1),
               terminar se todos os valores já foram classificados
         */
        for (int i = vetor.length - 1; i >= 0; i--) {
            aux[counts[vetor[i] - min]--] = vetor[i];
        }

    }

}
