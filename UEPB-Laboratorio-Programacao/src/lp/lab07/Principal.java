/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp.lab07;

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
        Controller c = new Controller();
        int option;

        do {
            option = menu();

            if (option != -1) {
                switch (option) {
                    case 1: {
                        c.create(leitura(c));
                        System.out.println("-------[ Contato adicionado ]-------");
                        break;
                    }
                    case 2: {
                        if (!c.isEmpty()) {
                            System.out.println("-------[ Encontre o contato ]-------");
                            String index = searchContact(c);

                            System.out.println("");
                            System.out.println("-------[ Atualização o contato ]-------");
                            leituraUpdate(c, index);

                            System.out.println("-------[ Contato atualizado ]-------");
                        } else {
                            System.out.println("-------[ Nenhum contato na agenda ]-------");
                        }
                        break;
                    }
                    case 3: {
                        if (!c.isEmpty()) {
                            System.out.println("-------[ Encontre o contato ]-------");
                            String index = searchContact(c);
                            c.remove(index);
                            System.out.println("-------[ Contato removido ]-------");
                        } else {
                            System.out.println("-------[ Nenhum contato na agenda ]-------");
                        }

                        System.out.println("");
                        break;
                    }
                    case 4: {
                        if (!c.isEmpty()) {
                            c.show();
                        } else {
                            System.out.println("-------[ Nenhum contato na agenda ]-------");
                        }
                        System.out.println("");
                        break;
                    }
                    case 5: {
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
        System.out.println("-------[ Agenda Telefônica ]-------");
        System.out.println("[1] Adicionar Contrato ");
        System.out.println("[2] Atualizar Contato ");
        System.out.println("[3] Remover Contato ");
        System.out.println("[4] Exibir Contatos ");
        System.out.println("[5] Fechar Programa ");
        try {
            return read.nextInt();
        } catch (Exception e) {
            System.out.println("Número inválido.");
            return -1;
        }
    }

    private static Agenda leitura(Controller c) {
        Scanner read = new Scanner(System.in);
        String nome, telefone;

        while (true) {
            System.out.println("Nome: ");
            nome = read.nextLine();
            if (c.hasContato(nome.toUpperCase())) {
                System.out.println("Contato já cadastrado.");
                continue;
            }
            break;
        }

        System.out.println("Telefone: ");
        telefone = read.nextLine();

        return new Agenda(nome.toUpperCase(), telefone);
    }

    private static void leituraUpdate(Controller c, String index) {
        String nome, telefone;
        int option = 3;
        index = index.toUpperCase();
        
        System.out.println("");

        do {
            Scanner readOption = new Scanner(System.in);
            System.out.println("-------[ " + c.getHashtable().get(index).getNome() + " ]-------");
            System.out.println("[1] Alterar NOME: ");
            System.out.println("[2] Alterar TELEFONE");
            System.out.println("[3] Fechar ");
            try {
                option = readOption.nextInt();
            } catch (Exception e) {
                System.out.println("Número inválido.");
                option = -1;
            }

            switch (option) {
                case 1: {
                    Scanner read = new Scanner(System.in);
                    while (true) {
                        System.out.println("Nome: ");
                        nome = read.nextLine();
                        if (c.hasContato(nome)) {
                            System.out.println("Contato já cadastrado.");
                            continue;
                        }
                        break;
                    }
                    Agenda agenda = c.getHashtable().get(index);
                    agenda.setNome(nome.toUpperCase());
                    agenda.setTelefone(c.getHashtable().get(index).getTelefone());
                    c.update(agenda, index);
                    System.out.println("-------[ " + c.getHashtable().get(index).getNome() + ": Nome atualizado ]-------");
                    System.out.println("");
                    break;
                }

                case 2: {
                    Scanner read = new Scanner(System.in);
                    System.out.println("Telefone: ");
                    telefone = read.nextLine();

                    Agenda agenda = c.getHashtable().get(index);
                    agenda.setNome(c.getHashtable().get(index).getNome());
                    agenda.setTelefone(telefone);
                    c.update(agenda, index);
                    System.out.println("-------[ "+c.getHashtable().get(index).getNome()+": Telefone atualizado ]-------");
                    System.out.println("");
                    break;
                }

                case 3: {
                    System.out.println("-------[ Edição do contato cancelada ]-------");
                    break;
                }

                default: {
                    option = -1;
                    System.out.println("-------[ Erro no processamento da solicitação ]-------");
                }

            }
            System.out.println("");

        } while (option != 3);

    }

    public static String searchContact(Controller c) {
        Scanner read = new Scanner(System.in);
        String nome;

        while (true) {
            System.out.println("Nome: ");
            nome = read.nextLine();
            if (c.hasContato(nome)) {
                break;
            }
            System.out.println("\"" + nome.toUpperCase() + "\" não foi encontrado na sua agenda.");
            System.out.println("");
        }

        return nome.toUpperCase();
    }

}
