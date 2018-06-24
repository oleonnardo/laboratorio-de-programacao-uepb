
package lp.lab04;

/**
 *
 * @aluno Leonardo Araujo Silva
 * @matricula 161080120
 */
public class Produto {
    
    private static int sequencia=0;
    private int codigo;
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.codigo = sequencia++;
        this.nome = nome.toUpperCase();
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String toString(Produto p) {
        return "Produto { Codigo " + p.getCodigo() + ", Nome: " + p.getNome() + ", Valor: " + p.getValor() + " }";
    }

        
}
