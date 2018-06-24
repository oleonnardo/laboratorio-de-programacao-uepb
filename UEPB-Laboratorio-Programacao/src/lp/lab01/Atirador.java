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
public class Atirador {
    
    private String nome;
    private double distancia;

    public Atirador(String nome, double distancia) {
        this.nome = nome;
        this.distancia = distancia;
    }

    public String getNome() {
        return nome;
    }

    public double getDistancia() {
        return distancia;
    }
    
}
