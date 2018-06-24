
/**
 * @aluno: Leonardo Araujo Silva
 * @matricula: 161080120
*/

package lp.lab02.Models;

import lp.lab02.App.Model;

public class Professor extends Contribuinte {
    
         private int num_salarios;
         private double material_didatico;

         public Professor(int num_salarios, double material_didatico, int codigo, String nome, double salario, double vcasa_propria, double vcarro) {
                  super(codigo, nome, salario, vcasa_propria, vcarro);
                  this.num_salarios = num_salarios;
                  this.material_didatico = material_didatico;
         }

         /**
          * @return : Retorna o valor da variável
         */
         public int getNumSalarios() {
                  return num_salarios;
         }

         /**
         * @param num_salarios: Atualiza o valor da variável
         */
         public void setNumSalarios(int num_salarios) {
                  this.num_salarios = num_salarios;
         }

         /**
          * @return : Retorna o valor da variável
         */
         public double getMaterialDidatico() {
                  return material_didatico;
         }

         /**
         * @param material_didatico: Atualiza o valor da variável
         */
         public void setMaterialDidatico(double material_didatico) {
                  this.material_didatico = material_didatico;
         }

         /**
         * @param ns: Número de Salários
         * @return double : Valor da Tributação
         */
         public double getTributacao(int ns){
                  /*
                  * 5% para quem ganha até 1 salário mínimo; 
                  * 10% até 5 salários mínimos;
                  * 20% acima de 5 salários mínimos;
                  */
                  String str = String.valueOf(ns);
                  double s =  Double.valueOf(str);
                  switch( ns ){
                           case 1: return ( s * Model.salarioMinimo )*0.05;
                           case 2: case 3: case 4: case 5: return ( s * Model.salarioMinimo)*0.1;
                           default:  return ( s * Model.salarioMinimo)*0.2;
                  }
         }

         /**
         * @param md : Valor de materiais didáticos adiquiridos pelo Professor
         * @return double : Valor do Desconto
         */
         public double getDesconto(double md){
                  return md * Model.descontoProfessor;
         }   

         /**
         * @param p: Classe Professor
         */         
         public void calcularImpostosDescontos(Professor p){
                  double tributacao = p.getTributacao(p.getNumSalarios());
                  double descontos = p.getDesconto(p.getMaterialDidatico());
                  double pagamento = tributacao - descontos;
                  p.situacaoContribuinte(descontos, pagamento, tributacao);
         }

         /**
         * @param p: Classe Professor
         */  
         public void toString(Professor p) {
                  double salarioBruto = p.getNumSalarios()*p.getNumSalarios();
                  System.out.println("Professor: {\n  Código: " + p.getCodigo() + ",\n  Nome: " + p.getNome() + ",\n  Salário: R$" + String.valueOf(salarioBruto) + ",\n  " +
                          "Valor da Casa: R$" + p.getCasaPropria() + ",\n  Valor do Carro: R$" + p.getCarro() + ",\n  Gasto com material didático: R$" + p.getMaterialDidatico() + "\n}");
         }
         
}
