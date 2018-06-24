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
public class SelectionSort {

    public static void run(int[] vetor) {
        long inicio = System.currentTimeMillis();
        selectionsort(vetor);
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        double t = (double) tempo / Funcoes.divisor;
        Funcoes.print(inicio, fim, t, "Selection Sort", vetor.length);
    }

    private static void selectionsort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int imin = i;
            int temp;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[imin]) {
                    imin = j;
                }
            }
            temp = a[i];
            a[i] = a[imin];
            a[imin] = temp;
        }
    }

}
