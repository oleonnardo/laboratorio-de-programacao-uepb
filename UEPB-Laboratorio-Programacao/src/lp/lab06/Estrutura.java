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
abstract class Estrutura {

    protected Client[] elements;
    protected int size;

    @SuppressWarnings("unchecked")
    public Estrutura(int size) {
        this.elements = new Client[size];
        this.size = 0;
    }

    public Estrutura() {
        this(10);
    }

    /**
     * Verifica se a fila está vazia
     *
     * @return
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Adiciona uma nova pessoa a fila
     *
     * @param elemento
     * @return
     */
    protected boolean add(Client client) {
        this.aumentaCapacidade();
        if (this.size < this.elements.length) {
            this.elements[this.size] = client;
            this.size++;
            return true;
        }
        return false;
    }

    protected boolean add(int posicao, Client elemento) {
        if (posicao < 0 || posicao > size) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        //movimenta todos os elementos
        for (int i = this.size - 1; i >= posicao; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[posicao] = elemento;
        this.size++;

        return true;
    }

    /**
     * Remove o primeiro da fila
     *
     * @param posicao
     */
    protected void remove(int posicao) {
        if (!(posicao >= 0 && posicao < this.size)) {
            throw new IllegalArgumentException("Posicao inválida.");
        }
        for (int i = posicao; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
    }

    @SuppressWarnings("unchecked")
    private void aumentaCapacidade() {
        if (this.size == this.elements.length) {
            Client[] newElements = new Client[this.elements.length * 2];
            for (int i = 0; i < this.elements.length; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    /**
     * Retorna o tamanho da fila
     *
     * @return
     */
    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            StringBuilder s = new StringBuilder();

            for (int i = 0; i < this.size - 1; i++) {
                s.append(this.elements[i]);
                s.append("");
            }
            if (this.size > 0) {
                s.append(this.elements[this.size - 1]);
            }

            return s.toString();
        } else {
            return "-------[ Todos os clientes foram atendidos ]-------";
        }
    }

}
