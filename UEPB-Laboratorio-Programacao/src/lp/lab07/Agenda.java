/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp.lab07;

/**
 *
 * @aluno Leonardo Araujo Silva
 * @matricula 161080120
 */
public class Agenda {
    
    private String nome;
    private String telefone;

    public Agenda(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Agenda { " + "Nome: " + nome + ", Telefone: " + telefone + " }; ";
    }
}
