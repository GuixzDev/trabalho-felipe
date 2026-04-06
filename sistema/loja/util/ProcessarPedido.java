package sistema.loja.util;

import sistema.loja.model.Computador;

/**
 * Classe utilitária para processar o pedido de compra.
 */
public class ProcessarPedido {

    private ProcessarPedido() {
        // Classe utilitária, não permite instanciação
    }

    /**
     * Método helper que recebe o array de computadores e exibe mensagem na tela.
     */
    public static void enviarPedido(Computador[] computadores, int total) {
        System.out.println("\nPedido enviado com sucesso! Total de itens: " + total);
    }
}
