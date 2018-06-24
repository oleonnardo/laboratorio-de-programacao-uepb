package lp.lab01;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1, n2;
        double d1=0.0, d2=0.0;
        
//        
//        Atirador a1 = new Atirador("Leo", 3.14);
//        Atirador a2 = new Atirador("Danilo", 3.41);
//        Competicao.imprimeVencedor(a1, a2);
//      Leo
        Scanner read = new Scanner(System.in);
        
        System.out.println("Atirador 1:");
        n1 = read.next();
        System.out.println("Distância Atirador 1:");
        try{
            d1 = read.nextDouble();
        }catch(java.util.InputMismatchException e){
            System.out.println("Distância incorreta. Distância ficará nula.");
        }
        
        System.out.println("Atirador 2:");
        n2 = read.next();
        System.out.println("Distância Atirador 2:");
        try{
            d2 = read.nextDouble();
        }catch(java.util.InputMismatchException e){
            System.out.println("Distância incorreta. Distância ficará nula.");
        }
        
        Atirador a1 = new Atirador(n1, d1);
        Atirador a2 = new Atirador(n2, d2);
        System.out.println("\n---------------------------------------\n");
        Competicao.imprimeVencedor(a1, a2);
    }
    
}
