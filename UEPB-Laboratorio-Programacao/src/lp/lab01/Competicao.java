/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp.lab01;

/**
 *
 * @author usuario
 */
public class Competicao {
    
    private Atirador a1, a2;

    public Competicao(Atirador a1, Atirador a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public Atirador getA1() {
        return a1;
    }

    public void setA1(Atirador a1) {
        this.a1 = a1;
    }

    public Atirador getA2() {
        return a2;
    }

    public void setA2(Atirador a2) {
        this.a2 = a2;
    }
    
    public static void imprimeVencedor(Atirador a1, Atirador a2){
        System.out.println("Vencedor: ");
        if( a1.getDistancia() == a2.getDistancia() ){
            System.out.println("Empate!");
        }else if( a1.getDistancia() > a2.getDistancia() ){
            System.out.println(a1.getNome() + "\nDistância:\n" + a1.getDistancia());
        }else{
            System.out.println(a2.getNome() + "\nDistância:\n" + a2.getDistancia());  
        }
    }
    
}
