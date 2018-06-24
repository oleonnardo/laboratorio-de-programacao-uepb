
/**
 * @aluno: Leonardo Araujo Silva
 * @matricula: 161080120
*/

package lp.lab02.Models;

import lp.lab02.App.Model;

public class Taxista extends Rodoviario {
         
         private int npassageiros; 

         public Taxista(int npassageiros, double quilometros, int codigo, String nome, double salario, double vcasa_propria, double vcarro) {
                  super(quilometros, codigo, nome, salario, vcasa_propria, vcarro);
                  this.npassageiros = npassageiros;
         }
          
         /**
          * @return : Retorna o valor da variável
         */
         public int getNumPassageiros() {
                  return npassageiros;
         }
         
         /**
         * @param npassageiros: Atualiza o valor da variável
         */
         public void setNumPassageiros(int npassageiros) {
                  this.npassageiros = npassageiros;
         }               

         /**
         * @param np: Número de Passageiros
         * @return double : Valor da Tributação
         */
         public double getTributacao(double np){
                  return  np * Model.tributacaoTaxista;
         } 

         /**
         * @param t: Classe Taxista
         */         
         public void calcularImpostosDescontos(Taxista t){
                  double tributacao = t.getTributacao( Double.valueOf(String.valueOf(t.getNumPassageiros())) );
                  double descontos = t.getDescontoRodoviario(t.getQuilometros());
                  double pagamento = tributacao - descontos;
                  t.situacaoContribuinte(descontos, pagamento, tributacao);
         }

         /**
         * @param t: Classe Taxista
         */ 
         public void toString(Taxista t) {
                  System.out.println("Taxista: {\n  Código: " + t.getCodigo() + ",\n  Nome: " + t.getNome() + ",\n  Salário: R$" + t.getSalario() + ",\n  " +
                          "Valor da Casa: R$" + t.getCasaPropria()  + ",\n  Valor do Carro: R$" + t.getCarro() + "\n  Número de passageiros: " + t.getNumPassageiros() + ",\n  " +
                          "Quilômetros rodados:" + t.getQuilometros() +"\n}");
         }
         
}
