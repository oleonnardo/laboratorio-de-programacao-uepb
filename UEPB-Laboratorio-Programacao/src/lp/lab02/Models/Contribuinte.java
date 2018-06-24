
/**
 * @aluno: Leonardo Araujo Silva
 * @matricula: 161080120
*/

package lp.lab02.Models;

import lp.lab02.App.Model;

public abstract class Contribuinte extends Model {
    
         private int codigo;
         private String nome;
         private double salario;
         private double vcasa_propria;
         private double vcarro;

         public Contribuinte(int codigo, String nome, double salario, double vcasa_propria, double vcarro) {
                  this.codigo = codigo;
                  this.nome = nome;
                  this.salario = salario;
                  this.vcasa_propria = vcasa_propria;
                  this.vcarro = vcarro;
         }
         
         /**
          * @return : Retorna o valor da variável
         */         
         public int getCodigo() {
                  return codigo;
         }
         
         /**
         * @param codigo: Atualiza o valor da variável
         */
         public void setCodigo(int codigo) {
                  this.codigo = codigo;
         }
         
         /**
          * @return : Retorna o valor da variável
         */
         public String getNome() {
                  return nome;
         }
         
         /**
         * @param nome: Atualiza o valor da variável
         */
         public void setNome(String nome) {
                  this.nome = nome;
         }
         
         /**
          * @return : Retorna o valor da variável
         */
         public double getSalario() {
                  return salario;
         }
         
         /**
         * @param salario: Atualiza o valor da variável
         */
         public void setSalario(double salario) {
                  this.salario = salario;
         }
         
         /**
          * @return : Retorna o valor da variável
         */
         public double getCasaPropria() {
                  return vcasa_propria;
         }
         
         /**
         * @param vcasa_propria: Atualiza o valor da variável
         */
         public void setCasaPropria(double vcasa_propria) {
                  this.vcasa_propria = vcasa_propria;
         }
         
         /**
          * @return : Retorna o valor da variável
         */
         public double getCarro() {
                  return vcarro;
         }
         
         /**
         * @param vcarro: Atualiza o valor da variável
         */
         public void setCarro(double vcarro) {
                  this.vcarro = vcarro;
         }         
         
         /**
         * @param descontos: Descontos do contribuine
         * @param pagamento: Pagamento do contruibunte
         * @param tributacao: Impostos 
         * @see Se os descontos apresentados forem maiores do que o imposto a ser pago, o contribuinte não paga imposto.
         */
         public void situacaoContribuinte(double descontos, double pagamento, double tributacao){
                  if( descontos > pagamento  ){
                           System.out.println("O contribuinte não pagará imposto.\n");       
                  }else{
                           System.out.println( "\nTributação: " + String.valueOf(tributacao) );
                           System.out.println("Descontos: " + String.valueOf(descontos) );      
                           System.out.println("Pagamento: " + String.valueOf(pagamento) );  
                  }
         }
         
         /**
          * @param valorCarroCasa: Soma do valor do carro e valor do casa
          * @param qtde: Quantidade de trabalhadores de uma categoria 
          * @return : Sinais exteriores de riqueza através do valor médio dos bens de trabalhadores de uma categoria, acrescidos de 50% desse valor.
         */
         public static double sinaisExterioresDeRiqueza(double valorCarroCasa, int qtde){
                  double media = ( valorCarroCasa / Double.valueOf(qtde) ) + 0.5;
                  return media;                  
         }
         
}
