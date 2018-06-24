package Classes;

import java.util.Random;

/**
* @Aluno: Leonardo Araujo Silva
* @Matrícula: 161080120
*/

public class Funcoes {

    public static final double divisor = 1000.0;
    
    /**
     *
     * @param size = Tamanho do Vetor
     * @return
     */
    public static int[] generateVetor(int size) {
        int[] vetor = new int[size];
        for (int i = 0; i < size; i++) {
            vetor[i] = randomNumber(999, 1);
        }
        return vetor;
    }
    
    /**
     *
     * @param size = Tamanho do Vetor
     * @return
     */
    public static int[] generateVetorMelhorCaso(int size) {
        int[] vetor = new int[size];
        for (int i = 0; i < size; i++) {
            vetor[i] = i+1;
        }
        return vetor;
    }
    
    /**
     *
     * @param size = Tamanho do Vetor
     * @return
     */
    public static int[] generateVetorPiorCaso(int size) {
        int[] vetor = new int[size];
        int cont=0;
        for (int i = size; i > 0; i--) {
            vetor[cont] = i;
            cont++;
        }
        return vetor;
    }

    /**
     *
     * @param max = valor máximo
     * @param min = valor mínimo
     * @return
     */
    public static int randomNumber(int max, int min) {
        Random rand = new Random();
        int num = rand.nextInt((max - min) + 1) + min;
        return num;
    }

    /**
     *
     * @param initialtime
     * @param finaltime
     * @param time
     * @param algoritmo
     * @param tamanho
     */
    public static void print(long initialtime, long finaltime, double time, String algoritmo, int tamanho) {
        System.out.println("======[ " + algoritmo + " ]======");
        System.out.println("Tamanho da Entrada: " + tamanho);
        System.out.println(": {\n   Tempo Inicial (milli): " + initialtime);
        System.out.println("   Tempo Final (milli): " + finaltime);
        System.out.println("   Delta Tempo (s): " + time + "\n}\n");
    }

    /**
     * 
     * @param vetor 
     */
    public static void printVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

}
