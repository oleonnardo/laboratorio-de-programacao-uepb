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

public class InsertionSort {

    public static void run(int[] vetor) {
        long inicio = System.currentTimeMillis();
        insertionsort(vetor);
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        double t = (double) tempo / Funcoes.divisor;
        Funcoes.print(inicio, fim, t, "Insertion Sort", vetor.length);
    }

    private static void insertionsort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int val = a[i];
            int hole = i;
            while (hole > 0 && a[hole - 1] > val) {
                a[hole] = a[hole - 1];
                hole = hole - 1;
            }
            a[hole] = val;
        }
    }
}
