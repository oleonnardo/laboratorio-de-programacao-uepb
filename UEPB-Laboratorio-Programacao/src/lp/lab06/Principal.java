/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp.lab06;

import java.util.Scanner;

/**
 *
 * @aluno Leonardo Araujo Silva
 * @matricula 161080120
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fila fila = new Fila();
        int option;

        do {
            option = menu();

            if (option != -1) {
                switch (option) {
                    case 1: {
                        Object[] dados = leitura();
                        fila.newClient(new Client(String.valueOf(dados[0]), Integer.valueOf(String.valueOf(dados[1]))));
                        System.out.println("-------[ Senha adicionada ]-------");
                        break;
                    }
                    case 2: {
                        if (!fila.isEmpty()) {
                            System.out.println(fila.removeClient());
                            System.out.println("-------[ Cliente atendido ]-------");
                        } else {
                            System.out.println("-------[ Todos os clientes foram atendidos ]-------");
                        }
                        break;
                    }
                    case 3: {
                        System.out.println(fila);
                        System.out.println("");
                        break;
                    }
                    case 4: {
                        option = 0;
                        System.out.println("Fechando aplicativo.");
                        break;
                    }
                    default:
                        option = 1;
                        System.out.println("-------[ Erro no processamento da solicitação ]-------");
                }
            }

            System.out.println("");

        } while (option != 0);
    }

    private static int menu() {
        Scanner read = new Scanner(System.in);
        System.out.println("-------[ Wayne Enterprise (WE) ]-------");
        System.out.println("[1] Adicionar Senha ");
        System.out.println("[2] Cliente Atendido ");
        System.out.println("[3] Exibir Fila ");
        System.out.println("[4] Fechar Programa ");
        try {
            return read.nextInt();
        } catch (Exception e) {
            System.out.println("Número inválido.");
            return -1;
        }
    }

    private static Object[] leitura() {
        Scanner read = new Scanner(System.in);
        String senha;
        int prioridade;

        System.out.println("Senha: ");
        senha = read.nextLine();

        do {
            System.out.println("Prioridade: ");
            System.out.println("[1] Preferencial");
            System.out.println("[2] Comum");
            try {
                prioridade = read.nextInt();
            } catch (Exception e) {
                prioridade = 0;
                System.out.println("Número inválido.");
            }

        } while (prioridade != 1 && prioridade != 2);

        return new Object[]{senha, prioridade};
    }

}
