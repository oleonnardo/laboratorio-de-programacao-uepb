/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp.lab03;

import java.util.Date;

/**
 * @aluno: Leonardo Araujo Silva
 * @matrícula: 161080120
 */
class Testes {

    public static void run() throws Exception {

        Produto.run("Produto1", 0, "Nao sei");
        Produto.run("Produto1", -2, "Horrivel");
        Produto.run("Produto1", 4, "Nada");
        Produto.run("Produto1", 3, "Nada");
        Produto.run("Produto1", 2, "Legal");
        Produto.run("Produto1", 1, "Ruim");
        Produto.run("Produto1", -2, "Pessimo");
        Produto.run("Produto1", -1, "Podia ser melhor");
        Produto.run("Produto1", 2, "Maravilhoso");
        Produto.run("Produto1", 2, "Otimo");
        Produto.run("Produto1", 1, "Muito bom!");

    }

}
