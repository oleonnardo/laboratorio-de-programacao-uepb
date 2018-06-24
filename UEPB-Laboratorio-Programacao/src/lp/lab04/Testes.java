
package lp.lab04;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @aluno Leonardo Araujo Silva
 * @matricula 161080120
 */
public class Testes {

    private final double[] valores = {
        530.0, -730.0, 1090.0, -890.0, 460.0, 1460.0, 70.0, 250.0, 530.0, 970.0, 1130.0, -470.0, 1240.0, -1870.0, 1230.0,
        1760.0, 800.0, 1000.0, -690.0, 1870.0, 1980.0, 360.0, -680.0, 1590.0, 1380.0, -650.0, -1330.0, 1340.0, 810.0, 900.0, -1860.0,
        1480.0, 570.0, 1120.0, 570.0, -630.0, 1180.0, 580.0, -1650.0, 1040.0, 560.0, 1940.0, 1520.0, 1000.0, 1330.0, 1300.0, -890.0, 1970.0,
        1350.0, -980.0, 890.0, 1710.0, 570.0, 350.0, 710.0, -260.0, 30.0, 1840.0, 120.0, 50.0, 1460.0, 750.0, 1250.0, 1570.0, 780.0, -1270.0,
        410.0, 800.0, -1670.0, 700.0, -1110.0, 1410.0, 1380.0, 740.0, 1950.0, 550.0, 1750.0, 1130.0, -200.0, 1880.0, 970.0, -950.0, 490.0, -1030.0,
        10.0, -1130.0, 1780.0, -1440.0, 1460.0, 170.0, 1580.0, 370.0, 490.0, 1160.0, -30.0, 1660.0, -120.0, 1930.0, 1910.0, 1770.0
    };

    private final int[] quantidades = {
        47, -83, 70, -63, 10, 39, 30, -91, 73, 86, 84, 87, 27, 33, 24, 70, 15, 16, 77, 8, 137, 60, 8, 112, 115, 76, 129, 53,
        68, 84, 13, 36, 11, 83, 70, 49, 127, 96, 113, 133, 37, 52, 6, 6, 15, 17, 107, 6, 123, 74, 29, 28, 27, 0, 82, 60, 136,
        81, 15, 130, 47, 16, 42, 122, -12, 98, 111, 53, 138, 10, 119, 146, -81, 140, 58, 41, -62, 142, 133, 74, 95, -60, 52, 38,
        2, 82, -1, -49, 1, 126, 87, 17, 71, 44, 101, 21, 87, 98, 104, 92, 131, 141, 3, 90, 32, 44, 70, 99, 6, 114, 54, 111, 28,
        55, -8, 117, 103, 140, 140, 10, 16, 30, 108, 15, 18, -21, 62, 19, 129, 20, -130, 115, 117, -29, 69, 66, 83, 117, -41, 0, 26,
        12, 26, -2, 56, -42, 65, 47, 38, 131
    };

    private final Random random = new Random();
    private final ListaProduto listaProduto = new ListaProduto();
    private final ListaPedidos listaPedidos = new ListaPedidos();

    private ArrayList<Produto> produtos;

    public void run() throws Exception {
        this.produto();
        System.out.println("\n\n");
        this.createPedidos();

    }

    private void produto() throws Exception {
        System.out.println("\n--------------------------------\n");
        System.out.println("CRIA E ADICIONA OS PRODUTOS\n");
        // CRIA E ADICIONA OS PRODUTOS
        for (int i = 0; i < this.valores.length; i++) {
            Produto p = new Produto("Produto" + i, this.valores[i]);
            this.listaProduto.addProduto(p);
        }

        // EXIBE OS PRODUTOS CADASTRADOS
        System.out.println("\n------------------------\nEXIBE OS PRODUTOS CADASTRADOS\n------------------------\n");
        this.listaProduto.listaProdutos();

        // REALIZA TESTES DE REMOÇÃO: PRODUTOS
        System.out.println("\n------------------------\nREALIZA TESTES DE REMOÇÃO: PRODUTOS\n------------------------\n");
        this.listaProduto.removerProduto("PRODUTO0");
        this.listaProduto.removerProduto("PRODUTO");
        this.listaProduto.removerProduto("PRODUTO33");
        this.listaProduto.removerProduto("PRODUTO938");
        System.out.println("------------------------\n");

    }

    private void createPedidos() throws Exception {

        System.out.println("\n--------------------------------\n");
        System.out.println("CRIA E ADICIONA OS PEDIDOS\n");
        // CRIA E ADICIONA OS PEDIDOS
        this.produtos = this.listaProduto.getProdutos();
        for (int i = 0; i < this.produtos.size(); i++) {
            Pedido pedido = new Pedido(this.quantidades[i], this.produtos.get(i));
            this.listaPedidos.addPedido(pedido);
        }

        // EXIBE O PEDIDO BUSCADO
        System.out.println("\n------------------------\nEXIBE O PEDIDO BUSCADO\n------------------------\n");
        this.listaPedidos.listarPedidos(3);

    }

}
