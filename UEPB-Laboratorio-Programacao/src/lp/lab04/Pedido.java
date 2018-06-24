
package lp.lab04;

import java.util.ArrayList;

/**
 *
 * @aluno Leonardo Araujo Silva
 * @matricula 161080120
 */
public final class Pedido extends Item {

    private static int sequencia = 0;

    private int codigo;
    private double valorTotal;

    private final ArrayList<Item> itens = new ArrayList();

    public Pedido(int quantidade, Produto produto) throws Exception {
        super(quantidade, produto);

        try {
            if (quantidade > 0 && quantidade <= 100) {
                
                this.codigo = sequencia++;
                this.valorTotal = quantidade * produto.getValor();
                this.addItem(new Item(quantidade, produto));
                
            } else {
                Excecoes.quantidadeInvalida();
            }
            
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
    }

    public int getCodigo() {
        return codigo;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void addItem(Item item) throws Exception {
        this.itens.add(item);
    }

    public void listarItens() {
        for (int i = 0; i < this.itens.size(); i++) {
            System.out.println(this.itens.get(i).toString(this.itens.get(i)));
        }
    }

    public void removerItem(String nome) {
        int cont = 0;
        String nomeRemovido = "";

        try {

            for (int i = 0; i < this.itens.size(); i++) {
                if (this.itens.get(i).getProduto().getNome().equals(nome.toUpperCase())) {
                    nomeRemovido = this.itens.get(i).getProduto().toString(this.itens.get(i).getProduto());
                    this.itens.remove(i);
                    cont++;
                }
            }

            if (cont == 0) {
                Excecoes.produtoNaoCadastrado();
            } else {
                System.out.println("Dados do item removido:\n" + nomeRemovido);
            }

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }

    }

    public void toString(Pedido p) {
        System.out.println("Pedido { Código: " + p.getCodigo() + ", Valor Total: " + p.getValorTotal() + " }");
        this.listarItensPedidos(p.getItens());
    }

    private void listarItensPedidos(ArrayList<Item> it) {
        for (int i = 0; i < it.size(); i++) {
            System.out.println(it.get(i).toString(it.get(i)));
        }
    }

}
