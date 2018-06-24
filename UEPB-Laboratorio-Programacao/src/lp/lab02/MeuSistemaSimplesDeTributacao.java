
/**
 * @aluno: Leonardo Araujo Silva
 * @matricula: 161080120
*/

package lp.lab02;

import java.util.ArrayList;
import java.util.Scanner;
import lp.lab02.App.Controller;
import lp.lab02.App.Faker;
import lp.lab02.App.Model;
import lp.lab02.Models.*;

public class MeuSistemaSimplesDeTributacao {

         /**
          * @param args the command line arguments
          */
         public static void main(String[] args)  {
                  int op;
                  Scanner read = new Scanner(System.in);
                  ArrayList <Object> contribuintes = new ArrayList();
                  
                  /**
                   * @see Faker Generator
                   * @ descomentar essa linha para gerar dados falsos
                   * @param max: quantidade de dados
                   * @param array: Arraylist contribuintes
                   */
                   //contribuintes = Faker.factory(10, contribuintes);
                  
                  do{
                   
                           System.out.println("\nCálculo de Tributos a serem pagos à Receita Federal\n");
                           System.out.println("O que deseja fazer?\n");
                           System.out.println("1. Cadastrar contribuintes.");
                           System.out.println("2. Calcular e mostrar impostos e descontos associados a um contribuinte.");
                           System.out.println("3. Listar os contribuintes em função dos sinais exteriores de riqueza.");      
                           System.out.println("4. Parar.");      
                           System.out.print(">> ");        
                           op = read.nextInt();

                           switch( op ){
                                    case 1: 
                                             Object object = Controller.register();
                                             if( object != null ) contribuintes.add(object) ; 
                                             break;
                                    case 2: 
                                             Controller.search(contribuintes);
                                             break;
                                    case 3:
                                             Controller.viewSinaisExteriores(contribuintes);
                                             break;
                                    case 4:
                                             System.out.println("Fim do Programa!");
                                             System.out.println("......");
                                             break;
                                    default:
                                             System.out.println("Opção inválida!");
                           }
                           
                  }while(op!=4);

         }
    
}
