/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp.lab06;

/**
 *
 * @aluno Leonardo Araujo Silva
 * @matricula 161080120
 */
public class Client implements Comparable<Client> {

    private String senha;
    private int prioridade;

    public Client(String senha, int prioridade) {
        super();
        this.senha = senha;
        this.prioridade = prioridade;
    }

    public Client() {
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Client client) {
        if (this.prioridade > client.getPrioridade()) {
            return 1;
        } else if (this.prioridade < client.getPrioridade()) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "\nCliente { Senha: " + senha + ", Prioridade: " + prioridade + " },";
    }

}
