
/**
 * @aluno: Leonardo Araujo Silva
 * @matricula: 161080120
*/

package lp.lab02.Models;

import lp.lab02.App.Model;

public class Medico extends Contribuinte{
    
         private int pacientes;
         private double despesa_congresso;

         public Medico(int pacientes, double despesa_congresso, int codigo, String nome, double salario, double vcasa_propria, double vcarro) {
                  super(codigo, nome, salario, vcasa_propria, vcarro);
                  this.pacientes = pacientes;
                  this.despesa_congresso = despesa_congresso;
         }

         /**
          * @return : Retorna o valor da variável
         */
         public int getPacientes() {
                  return pacientes;
         }

         /**
         * @param pacientes: Atualiza o valor da variável
         */
         public void setPacientes(int pacientes) {
                  this.pacientes = pacientes;
         }
         
         /**
          * @return : Retorna o valor da variável
         */
         public double getDespesaCongresso() {
                  return despesa_congresso;
         }
         
         /**
         * @param despesa_congresso: Atualiza o valor da variável
         */
         public void setDespesaCongresso(double despesa_congresso) {
                  this.despesa_congresso = despesa_congresso;
         }         

         /**
         * @param np: Número de Pacientes
         * @return double : Valor da Tributação
         */
         public double  getTributacao(int np){
                  String s = String.valueOf(np);
                  return Double.valueOf(s) * Model.tributacaoMedico;
         }

         /**
         * @param m: Classe Medico
         */         
         public void calcularImpostosDescontos(Medico m){
                  double tributacao = m.getTributacao(m.getPacientes());
                  double descontos = m.getDespesaCongresso();
                  double pagamento = tributacao - descontos;
                  m.situacaoContribuinte(descontos, pagamento, tributacao);
         }

         /**
         * @param m: Classe Medico
         */ 
         public void toString(Medico m) {
                  System.out.println("Medico: {\n  Código: " + m.getCodigo() + ",\n  Nome: " + m.getNome() + ",\n  Salário: R$" + m.getSalario() + ",\n  " +
                           "Valor da Casa: R$" + m.getCasaPropria() + ",\n  Valor do Carro: R$" + m.getCarro() + ",\n   Pacientes: " + m.getPacientes() + ",\n  " +
                           "Despesas com o congresso: R$" + m.getDespesaCongresso() + "\n}");
         }        
         
}
