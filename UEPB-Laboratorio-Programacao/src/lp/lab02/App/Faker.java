
/**
 * @aluno: Leonardo Araujo Silva
 * @matricula: 161080120
*/

package lp.lab02.App;

import java.util.ArrayList;
import java.util.Scanner;
import static lp.lab02.App.Controller.rand;
import lp.lab02.Models.Caminhoneiro;
import lp.lab02.Models.Medico;
import lp.lab02.Models.Professor;
import lp.lab02.Models.Taxista;

public class Faker {
    
         /**
          * @param max: Valor maximo de registros falsos
          * @param c: Objecto ArrayList a ser preenchido
          * @return ArrayList preenchido com dados falsos
         */
         public static ArrayList<Object> factory(int max, ArrayList <Object> c){
                  Object objects;
                  String nome;
                  int profissao, codigo, pacientes, num_salarios, npassageiros;
                  double salario, vcasa_propria, vcarro, toneladas, quilometros, despesa_congresso, material_didatico;
                  
                  System.out.println("\nFAKER GENERATE --------------------");
                  System.out.println("Códigos Cadastrados:");
                  for (int i = 1; i < max; i++) {
                           profissao = Controller.rand(0, 3);
                           codigo = Controller.concat(profissao+1, rand(100, 999));
                           nome = Model.profissoes[profissao] + "-" + i;
                           salario = Controller.rand(1000, 20000);
                           vcasa_propria = Controller.rand(50000, 200000);
                           vcarro = Controller.rand(50000, 200000);
                           System.out.println("- "+codigo);
                           switch( profissao ){
                                    case 0:
                                             toneladas = Controller.rand(10, 200);
                                             quilometros = Controller.rand(10, 200);
                                             Caminhoneiro caminhoneiro = new Caminhoneiro(toneladas, quilometros, codigo, nome, salario,  vcasa_propria, vcarro);
                                             objects = caminhoneiro;
                                             break;
                                    case 1:
                                             pacientes = Controller.rand(100, 500);
                                             despesa_congresso = Controller.rand(1000, 20000);
                                             Medico medico = new Medico(pacientes, despesa_congresso, codigo, nome, salario, vcasa_propria, vcarro);
                                             objects = medico;
                                             break;
                                    case 2:
                                             num_salarios = Controller.rand(1, 5);
                                             material_didatico = Controller.rand(200, 3500);
                                             Professor professor = new Professor(num_salarios, material_didatico, codigo, nome, salario,  vcasa_propria, vcarro);
                                             objects = professor;
                                             break;
                                    default:
                                             npassageiros = Controller.rand(100, 500);
                                             quilometros = Controller.rand(2000, 4000);
                                             Taxista taxista = new Taxista(npassageiros, quilometros, codigo, nome, salario,  vcasa_propria, vcarro);
                                             objects = taxista;
                                             break;                           
                           }
                           
                           c.add(objects);
                           
                  }
                                    
                  return c;
                  
         }
    
}
