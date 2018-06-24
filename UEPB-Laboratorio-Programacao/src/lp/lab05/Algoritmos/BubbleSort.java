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

public class BubbleSort {

    public static void run(int[] vetor) {
        long inicio = System.currentTimeMillis();
        bubblesort(vetor);
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        double t = (double) tempo / Funcoes.divisor;
        Funcoes.print(inicio, fim, t, "Bubble Sort", vetor.length);
    }

    private static void bubblesort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    a = swap(a, j, j + 1);
                }
            }
        }
    }

    private static int[] swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }

}
