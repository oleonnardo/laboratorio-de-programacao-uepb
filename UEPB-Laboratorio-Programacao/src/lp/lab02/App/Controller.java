
/**
 * @aluno: Leonardo Araujo Silva
 * @matricula: 161080120
*/

package lp.lab02.App;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import lp.lab02.Models.Caminhoneiro;
import lp.lab02.Models.Contribuinte;
import lp.lab02.Models.Medico;
import lp.lab02.Models.Professor;
import lp.lab02.Models.Taxista;

public class Controller {
         
         /**
          * @see Cadastro de contribuintes  
          */
         public static Object register(){
                 Scanner read = new Scanner(System.in);
                 Object object = new Object();
                 
                 int profissao = readProfession();
                 
                 // Usuário Cancela o Cadastro
                 if( profissao == 4 ) {
                          return null;
                 }
                 
                 int codigo = concat(profissao+1, rand(100, 999));
                 
                 System.out.println("\nCódigo do Contribuinte: " + codigo);
                  
                 System.out.println("Nome: ");
                 System.out.print(">> ");
                 String nome = read.nextLine();
                 
                 System.out.println("Salário: ");
                 System.out.print(">> ");
                  double salario = read.nextDouble();
                 
                 System.out.println("Valor da Casa: ");
                 System.out.print(">> ");
                  double vcasa_propria = read.nextDouble();
                 
                 System.out.println("Valor do Carro: ");
                 System.out.print(">> ");
                  double vcarro = read.nextDouble();
                  
                  Object[] contribuinte = {
                           codigo, nome, salario, vcasa_propria, vcarro
                  };
                  
                  /**
                   * @sequencia profissoes = {  "Caminhoneiro", "Médico", "Professor", "Taxista" }         
                   */
                  object = null;
                  switch( profissao ){
                           case 0:
                                    object = createdCaminhoneiro(codigo, nome, salario,  vcasa_propria, vcarro, profissao);
                                    break;
                           case 1:
                                    object = createdMedico(codigo, nome, salario,  vcasa_propria, vcarro, profissao);
                                    break;
                           case 2:
                                    object = createdProfessor(codigo, nome, salario,  vcasa_propria, vcarro, profissao);
                                    break;
                           default:
                                    object = createdTaxista(codigo, nome, salario,  vcasa_propria, vcarro, profissao);
                                    break;                           
                  }
                  
                  System.out.println("Código do Contribuinte: " + codigo);
                  System.out.println("\nCadastro concluído!");
                  System.out.println("----------------------------");
                  return object;                 
         }
         
         /**
          * 
          * @param codigo: Código de cadastro (possui a categoria de profissão)
          * @param nome: Nome do contribuinte
          * @param salario: Salário do contribuinte
          * @param vcasa_propria: Valor da casa 
          * @param vcarro: Valor do carro
          * @param profissao: Categoria de Profissão
          * @return 
          */
         protected static Caminhoneiro createdCaminhoneiro(int codigo, String nome, double salario,  double vcasa_propria, double vcarro, int profissao){
                  Scanner read = new Scanner(System.in);
                  System.out.println("\nProfissão: " + Model.profissoes[profissao]);
                  System.out.println("Toneladas transportadas em um ano: ");
                  System.out.print(">> ");
                  double toneladas = read.nextDouble();

                  System.out.println("Quilômetros rodados em um ano (km): ");
                  System.out.print(">> ");
                  double quilometros = read.nextDouble();

                  Caminhoneiro object = new Caminhoneiro(toneladas, quilometros, codigo, nome, salario,  vcasa_propria, vcarro);
                  return object;
         }
         
         /**
          * 
          * @param codigo: Código de cadastro (possui a categoria de profissão)
          * @param nome: Nome do contribuinte
          * @param salario: Salário do contribuinte
          * @param vcasa_propria: Valor da casa 
          * @param vcarro: Valor do carro
          * @param profissao: Categoria de Profissão
          * @return 
          */
         protected static Medico createdMedico(int codigo, String nome, double salario,  double vcasa_propria, double vcarro, int profissao){
                  Scanner read = new Scanner(System.in);
                  System.out.println("\nProfissão: " + Model.profissoes[profissao]);
                  System.out.println("Número de pacientes atendidos no ano: ");
                  System.out.print(">> ");
                  int pacientes = read.nextInt();

                  System.out.println("Valor de despesas com Congressos (R$): ");
                  System.out.print(">> ");
                  double despesa_congresso = read.nextDouble();
                  
                  Medico object = new Medico(pacientes, despesa_congresso, codigo, nome, salario, vcasa_propria, vcarro);
                  return object;
         }
         
         /**
          * 
          * @param codigo: Código de cadastro (possui a categoria de profissão)
          * @param nome: Nome do contribuinte
          * @param salario: Salário do contribuinte
          * @param vcasa_propria: Valor da casa 
          * @param vcarro: Valor do carro
          * @param profissao: Categoria de Profissão
          * @return 
          */
         protected static Professor createdProfessor(int codigo, String nome, double salario,  double vcasa_propria, double vcarro, int profissao){
                  Scanner read = new Scanner(System.in);
                  int num_salarios;
                  System.out.println("\nProfissão: " + Model.profissoes[profissao]);
                  do{
                           System.out.println("Quantidade de salários do professor: ");
                           System.out.print(">> ");
                           num_salarios = read.nextInt();  
                           if( num_salarios==0 )
                                    System.out.println("Valor inválido.\nSe você recebe somente um salário informe: 1.\n");
                  }while(num_salarios<1);

                  System.out.println("Despesas com material didático (R$):");
                  System.out.print(">> ");
                  double material_didatico = read.nextDouble();

                  Professor object = new Professor(num_salarios, material_didatico, codigo, nome, salario,  vcasa_propria, vcarro);
                  return object;
         }
         
         /**
          * 
          * @param codigo: Código de cadastro (possui a categoria de profissão)
          * @param nome: Nome do contribuinte
          * @param salario: Salário do contribuinte
          * @param vcasa_propria: Valor da casa 
          * @param vcarro: Valor do carro
          * @param profissao: Categoria de Profissão
          * @return 
          */
         protected static Taxista createdTaxista(int codigo, String nome, double salario,  double vcasa_propria, double vcarro, int profissao){
                  Scanner read = new Scanner(System.in);
                  System.out.println("\nProfissão: " + Model.profissoes[profissao]);
                  System.out.println("Número de passageiros em um ano: ");
                  System.out.print(">> ");
                  int npassageiros = read.nextInt();

                  System.out.println("Quilômetros rodados em um ano (km): ");
                  System.out.print(">> ");
                  double quilometros = read.nextDouble();
                  
                  Taxista object = new Taxista(npassageiros, quilometros, codigo, nome, salario,  vcasa_propria, vcarro);
                  return object;
         }
         
         /**
          * @param contribuintes
          * @see Exibir os sinais exteriores de riqueza das categorias
          */
         public static void viewSinaisExteriores(ArrayList<Object> contribuintes){
                  int qtdeCaminhoneiro = contContribuintes("Caminhoneiro", contribuintes);
                  int qtdeMedico = contContribuintes("Medico", contribuintes);
                  int qtdeProfessor = contContribuintes("Professor", contribuintes);
                  int qtdeTaxista = contContribuintes("Taxista", contribuintes);
                  
                  double somaCaminhoneiro = sumContribuintes("Caminhoneiro", contribuintes);
                  double somaMedico = sumContribuintes("Medico", contribuintes);
                  double somaProfessor = sumContribuintes("Professor", contribuintes);
                  double somaTaxista = sumContribuintes("Taxista", contribuintes);
                  
                  System.out.println("\nSinais de Riqueza: Caminhoneiros");
                  if( qtdeCaminhoneiro > 0){
                           System.out.println( Contribuinte.sinaisExterioresDeRiqueza(somaCaminhoneiro, qtdeCaminhoneiro) );
                  }else{
                           System.out.println("Nenhum cadastro na categoria.");
                  }
                  
                  System.out.println("\nSinais de Riqueza: Médicos");
                  if( qtdeMedico > 0){
                           System.out.println( Contribuinte.sinaisExterioresDeRiqueza(somaMedico, qtdeMedico) );
                  }else{
                           System.out.println("Nenhum cadastro na categoria.");
                  }
                  
                  System.out.println("\nSinais de Riqueza: Professor");
                  if( qtdeProfessor > 0){
                           System.out.println( Contribuinte.sinaisExterioresDeRiqueza(somaProfessor, qtdeProfessor) );
                  }else{
                           System.out.println("Nenhum cadastro na categoria.");
                  }
                 
                  System.out.println("\nSinais de Riqueza: Taxista");
                  if( qtdeTaxista > 0){
                           System.out.println( Contribuinte.sinaisExterioresDeRiqueza(somaTaxista, qtdeTaxista) );
                  }else{
                           System.out.println("Nenhum cadastro na categoria.");
                  }
                  Contribuinte.sinaisExterioresDeRiqueza(somaTaxista, qtdeTaxista);
                  
         }
         
         /**
          * 
          * @param categoria: Categoria do contribuinte
          * @param contribuintes: ArrayList contendo o registro dos contribuintes
          * @return: Quantidade de registros na categoria selecionda
          */         
         private static int contContribuintes(String categoria, ArrayList contribuintes){
                  int cont=0;
                  for (int i = 0; i < contribuintes.size(); i++) {
                           String className = contribuintes.get(i).getClass().getName();   
                           if( className.endsWith( categoria ) )
                                    cont++;
                  }
                  return cont;
         }         
        
         /**
          * 
          * @param categoria: Categoria do contribuinte
          * @param contribuintes: ArrayList contendo o registro dos contribuintes
          * @return: Soma dos valores dos bens na categoria selecionda
          */  
         private static double sumContribuintes(String categoria, ArrayList contribuintes){
                  double carro=0, casa=0, total=0;
                  for (int i = 0; i < contribuintes.size(); i++) {
                           String className = contribuintes.get(i).getClass().getName();   
                           
                           if( className.endsWith("Caminhoneiro") && categoria.equals("Caminhoneiro")){
                                    Caminhoneiro c = (Caminhoneiro) contribuintes.get(i);
                                    total = total + c.getCarro() + c.getCasaPropria();
                                    
                           }else if( className.endsWith("Medico") && categoria.equals("Medico")){
                                    Medico m = (Medico) contribuintes.get(i);
                                    total = total + m.getCarro() + m.getCasaPropria();
                                    
                           }else if( className.endsWith("Professor") && categoria.equals("Professor")){
                                    Professor p = (Professor) contribuintes.get(i);
                                    total = total + p.getCarro() + p.getCasaPropria();
                                    
                           }else if( className.endsWith("Taxista") && categoria.equals("Taxista")){
                                    Taxista t = (Taxista) contribuintes.get(i);
                                    total = total + t.getCarro() + t.getCasaPropria();
                           }                                    
                  }
                  return total;
         }
         
                 
         /**
          * 
          * @param contribuintes : ArrayList contendo o registro dos contribuintes
          */  
         public static void search(ArrayList<Object> contribuintes){
                  ArrayList <Integer> codigos = instaceOfObject(contribuintes);
                  Scanner read = new Scanner(System.in);
                  System.out.println("\nCódigo do Contribuinte: ");
                  System.out.print(">> ");
                  int codigo = read.nextInt();
                  System.out.print("\n");
                  
                  for(int i=0; i<codigos.size(); i++){
                           if( codigo == codigos.get(i) ){
                                    show(codigos.get(i), contribuintes.get(i));
                                    break;
                           }
                  }   
         }
         
         /**
          * 
          * @param codigo: Código da profissão/categoria do contribuinte
          * @param object: Posição no arraylist de contribuintes
          * @see Função auxiliadora da função anterior
          */
         public static void show(int codigo, Object object){
                  int profissao = extractId(codigo);
                  int indice = profissao - 1;
                  
                  //  Ordem: Caminhoneiro, Médico, Professor, Taxista
                  switch(indice){
                           case 0:{
                                    Caminhoneiro c = (Caminhoneiro) object;
                                    c.toString(c);
                                    c.calcularImpostosDescontos(c);
                                    break;
                           }
                           case 1:{
                                    Medico m = (Medico) object;
                                    m.toString(m);
                                    m.calcularImpostosDescontos(m);
                                    break;
                           }
                           case 2:{
                                    Professor p = (Professor) object;
                                    p.toString(p);
                                    p.calcularImpostosDescontos(p);
                                    break;
                           }
                           case 3:{
                                    Taxista t = (Taxista) object;
                                    t.toString(t);
                                    t.calcularImpostosDescontos(t);
                                    break;
                           }
                  }
                  
         }
         
         /**
          * @see Leitura da Profissão  
          * @return Índice da profissão selecionada
          */
         private static int readProfession(){
                 Scanner read = new Scanner(System.in);
                 int opcao = 0, i, j;
                 
                 do{
                          System.out.println("\nSelecione uma categoria:");
                          for(i=0; i < Model.profissoes.length; i++){
                                   j=i+1;
                                   System.out.println( j+". "+Model.profissoes[i]);
                          } 
                          System.out.println("5. Voltar");       
                          System.out.print(">> ");
                          opcao = read.nextInt();
                          
                          if( opcao<1 || opcao>5)
                                   System.out.println("Opção inválida!");
                          
                 }while( opcao<1 || opcao>5);
                 
                 return opcao-1;        
         }
         
         /**
          * 
          * @param min: Valor minimo
          * @param max: Valor máximo
          * @return: Gera e retorna um número aleatório
          */
         public static int rand(int min, int max) {
                  Random rand = new Random();
                  int randomNum = rand.nextInt((max - min) + 1) + min;
                  return randomNum;
         }
         
         /**
          * 
          * @param n1: Número inteiro 1
          * @param n2: Número inteiro 2
          * @return: Retorna os numeros concatenados
          */
         protected static int concat( int n1, int n2){
                  String s = String.valueOf(n1) + String.valueOf(n2);
                  return Integer.parseInt(s);
         }
         
         /**
          * 
          * @param c: Codigo do contribuinte
          * @see Função responsável por identificar o tipo de categoria do contribuinte
          * @return: O Indice da posição de uma profissão/categoria
          */
         public static Integer extractId(int c){
                  String s = String.valueOf(c);
                  s = s.substring(0, 1);
                  return Integer.valueOf( s );
         }
         
         /**
          * 
          * @param contribuintes: ArrayList contendo o registro dos contribuintes
          * @return: o arraylist com todos os codigos cadastrados
          */
         private static ArrayList<Integer> instaceOfObject(ArrayList<Object> contribuintes){
                  ArrayList<Integer> codigos = new ArrayList();
                  
                  for (int i = 0; i < contribuintes.size(); i++) {
                           String className = contribuintes.get(i).getClass().getName();
                           if( className.endsWith("Caminhoneiro") ){
                                    Caminhoneiro caminhoneiro = (Caminhoneiro) contribuintes.get(i);
                                    codigos.add(caminhoneiro.getCodigo());
                           }else if( className.endsWith("Medico") ){
                                    Medico medico = (Medico) contribuintes.get(i);
                                    codigos.add(medico.getCodigo());
                           }else if( className.endsWith("Professor") ){
                                    Professor professor = (Professor) contribuintes.get(i);
                                    codigos.add(professor.getCodigo());
                           }else if( className.endsWith("Taxista") ){
                                    Taxista taxista = (Taxista) contribuintes.get(i);
                                    codigos.add(taxista.getCodigo());
                           }
                  }
                  
                  return codigos;
         }
}
