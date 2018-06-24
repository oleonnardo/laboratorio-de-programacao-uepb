
package lp.lab04;

import java.util.ArrayList;

/**
 *
 * @aluno Leonardo Araujo Silva
 * @matricula 161080120
 */
public class ListaPedidos {

    private final ArrayList<Pedido> pedidos = new ArrayList();

    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void listarPedidos(int codigo) {
        boolean nomeInexistente = false;

        try {

            for (int i = 0; i < this.pedidos.size(); i++) {
                if (this.pedidos.get(i).getCodigo() == codigo) {
                    this.pedidos.get(i).toString(this.pedidos.get(i));
                    nomeInexistente = true;
                }
            }

            if ( ! nomeInexistente ) {
                Excecoes.pedidoInexistente();
            } 
            
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }

    }

}
