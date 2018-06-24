/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Algoritmos.*;

/**
* @Aluno: Leonardo Araujo Silva
* @Matrícula: 161080120
*/

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = Funcoes.generateVetor(1000);
        
        BubbleSort.run(vetor);
        vetor.clone();

        QuickSort.run(vetor);
        vetor.clone();
        
        MergeSort.run(vetor);
        vetor.clone();
        
        InsertionSort.run(vetor);
        vetor.clone();
        
        /*
        
        BubbleSort.run(vetor);
        vetor.clone();

        SelectionSort.run(vetor);
        vetor.clone();
        
        MergeSort.run(vetor);
        vetor.clone();
        
        InsertionSort.run(vetor);
        vetor.clone();
        
        QuickSort.run(vetor);
        vetor.clone();
       
        CountingSort.run(vetor);
        vetor.clone();
       
        RadixSort.run(vetor);
        vetor.clone();
         */
    }

}
