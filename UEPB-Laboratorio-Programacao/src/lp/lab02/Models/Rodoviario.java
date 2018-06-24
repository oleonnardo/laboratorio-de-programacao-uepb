
/**
 * @aluno: Leonardo Araujo Silva
 * @matricula: 161080120
*/

package lp.lab02.Models;

import lp.lab02.App.Model;

public abstract class Rodoviario extends Contribuinte{
         
         private double quilometros;

         public Rodoviario(double quilometros, int codigo, String nome, double salario, double vcasa_propria, double vcarro) {
                  super(codigo, nome, salario, vcasa_propria, vcarro);
                  this.quilometros = quilometros;
         }
         
         /**
          * @return : Retorna o valor da variável
         */
         public double getQuilometros() {
                  return quilometros;
         }
         
         /**
         * @param quilometros: Atualiza o valor da variável
         */
         public void setQuilometros(double quilometros) {
                  this.quilometros = quilometros;
         }        

         /**
         * @param q: Quilômetos
         * @return double : Valor do Desconto
         */         
         public double getDescontoRodoviario(double q){
                  return q * Model.descontoRodoviario;
         }
                 
}
