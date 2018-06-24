
package lp.lab04;

/**
 *
 * @aluno Leonardo Araujo Silva
 * @matricula 161080120
 */
public class Item {
 
    private int quantidade;
    private Produto produto;

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public String toString(Item i) {
        return "Item { Qtde: " + i.getQuantidade() + " }\n" + i.getProduto().toString(i.getProduto());
    }
    
}
