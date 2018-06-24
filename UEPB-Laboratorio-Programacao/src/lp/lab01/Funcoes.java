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
public class Funcoes {
    
    public static Atirador imprimeVencedor(Atirador a1, Atirador a2){
        if( a1.getDistancia() == a2.getDistancia() ){
            return null;
        }else if( a1.getDistancia() > a2.getDistancia() ){
            return a1;
        }
        return a2;
    }
    
}
