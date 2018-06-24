
/**
 * @aluno: Leonardo Araujo Silva
 * @matricula: 161080120
*/

package lp.lab02.App;

public class Model {

         public static String[] profissoes = {
                  "Caminhoneiro", "Médico", "Professor", "Taxista"
         };
         
         // Caminhoneiro ------------------------------------ 
         public static double taxaFixaCaminhoneiro = 500.00;
         
         // Taxista --------------------------------------------
         // R$ 0,5 por passageiro
         public static double tributacaoTaxista = 0.5;     
         
         // Rodoviários ---------------------------------------
         // Equivalem a R$ 0,01 p/ km.
         public static double descontoRodoviario = 0.01;
         
         // Médicos -------------------------------------------
         // Nº de pacientes (R$ 10,00 por cada)
         public static double tributacaoMedico = 10.0;
         
         // Professores --------------------------------------
         // 50% de desconto com material didático
         public static double salarioMinimo = 954.0;
         public static double descontoProfessor = 0.5;
      
}

