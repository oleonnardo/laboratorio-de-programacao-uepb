
package lp.lab04;

/**
 *
 * @aluno Leonardo Araujo Silva
 * @matricula 161080120
 */
public class Excecoes {

    /**
     *
     * @throws java.lang.Exception
     * Quando for digitado um valor de preço negativo para um produto
     */
    public static void valorInvalido() throws Exception {
        throw new Exception("O preço digitado não pode ser negativo.");
    }

    /**
     *
     * @throws java.lang.Exception
     * Quando for digitado um valor negativo para quantidade ou um valor acima de 100 unidades
     */
    public static void quantidadeInvalida() throws Exception {
        throw new Exception("O valor digitado é negativo ou é valor acima de 100 unidades.");
    }

    /**
     *
     * @throws java.lang.Exception
     * Quando houver uma tentativa de remoção sem que exista o produto cadastrado
     */
    public static void produtoNaoCadastrado() throws Exception {
        throw new Exception("Tentativa de remoção de um produto não cadastrado.");
    }

    /**
     *
     * @throws java.lang.Exception
     * Quando for solicitado a listagem de um pedido que não existe
     */
    public static void pedidoInexistente() throws Exception {
        throw new Exception("Produto não existe.");
    }

}
