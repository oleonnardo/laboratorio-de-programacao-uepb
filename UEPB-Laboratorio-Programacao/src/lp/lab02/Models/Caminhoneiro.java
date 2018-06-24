
/**
 * @aluno: Leonardo Araujo Silva
 * @matricula: 161080120
*/

package lp.lab02.Models;

import lp.lab02.App.Model;

public class Caminhoneiro extends Rodoviario {
         
         private double toneladas;

         public Caminhoneiro(double toneladas, double quilometros, int codigo, String nome, double salario, double vcasa_propria, double vcarro) {
                  super(quilometros, codigo, nome, salario, vcasa_propria, vcarro);
                  this.toneladas = toneladas;
         }
         
         /**
          * @return : Retorna o valor da variável
         */
         public double getToneladas() {
                  return toneladas;
         }
         
         /**
         * @param toneladas: Atualiza o valor da variável
         */
         public void setToneladas(double toneladas) {
                  this.toneladas = toneladas;
         }

         /**
         * @param t: Toneladas
         * @return double : Valor da Tributação
         */
         public double getTributacao(double t){
                  if(  t <= 10 ){
                           return Model.taxaFixaCaminhoneiro;
                  }
                  return Model.taxaFixaCaminhoneiro + t * 100;
         }

         /**
         * @param c: Classe Caminhoneiro
         */         
         public void calcularImpostosDescontos(Caminhoneiro c){
                  double tributacao = c.getTributacao(c.getToneladas());
                  double descontos = c.getDescontoRodoviario(c.getQuilometros());
                  double pagamento = tributacao - descontos;
                  c.situacaoContribuinte(descontos, pagamento, tributacao);
         }
                  
         /**
         * @param c: Classe Caminhoneiro
         */  
         public void toString(Caminhoneiro c) {
                  System.out.println("Caminhoneiro: {\n Código: " + c.getCodigo() + ",\n  Nome: " + c.getNome() + ",\n  Salário: R$" + c.getSalario() + ",\n  " +
                          "Valor da Casa: R$" + c.getCasaPropria() + ",\n  Valor do Carro: R$" + c.getCarro() + ",\n  Toneladas: " + c.getToneladas() + ",\n  " +
                          "Quilômetros rodados:" + c.getQuilometros() +" \n}");
         }         
         
}
