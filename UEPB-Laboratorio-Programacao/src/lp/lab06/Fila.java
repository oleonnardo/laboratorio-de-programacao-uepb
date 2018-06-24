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
public class Fila extends Estrutura {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void newClient(Client client) {
        Comparable<Client> key = (Comparable<Client>) client;
        int i = 0;
        for (i = 0; i < this.size; i++) {
            if (key.compareTo(this.elements[i]) < 0) {
                break;
            }
        }
        this.add(i, client);
    }

    public Client view() {
        return (this.isEmpty()) ? null : this.elements[0];
    }

    public Client removeClient() {
        final int posicao = 0;
        if (this.isEmpty()) {
            return null;
        }
        Client elementRemove = this.elements[posicao];
        this.remove(posicao);
        return elementRemove;
    }

}
