
package lp.lab04;

import java.util.ArrayList;

/**
 *
 * @aluno Leonardo Araujo Silva
 * @matricula 161080120
 */
public class ListaProduto {

    private final ArrayList<Produto> produtos = new ArrayList();

    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }

    public void addProduto(Produto produto) throws Exception {
        try {
            if (produto.getValor() >= 0) {
                this.produtos.add(produto);
            } else {
                Excecoes.valorInvalido();
            }
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }

    public void listaProdutos() {
        for (int i = 0; i < this.produtos.size(); i++) {
            System.out.println(this.produtos.get(i).toString(this.produtos.get(i)));
        }
    }

    public void removerProduto(String nome) {
        int cont = 0;
        String nomeRemovido = "";

        try {

            for (int i = 0; i < this.produtos.size(); i++) {
                if (this.produtos.get(i).getNome().equals(nome.toUpperCase())) {
                    nomeRemovido = this.produtos.get(i).toString(this.produtos.get(i));
                    this.produtos.remove(i);
                    cont++;
                }
            }
            
            System.out.println("----------------");

            if (cont == 0) {
                Excecoes.produtoNaoCadastrado();
            } else {
                System.out.println("Dados do produto removido:\n" + nomeRemovido);
            }

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }

    }

}
