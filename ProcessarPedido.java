import java.util.ArrayList;

/**
 * Classe utilitria para processar o pedido de compra.
 */
public class ProcessarPedido {

    private ProcessarPedido() {
        // Classe utilitria, no permite instanciacao
    }

    /**
     * Metodo helper que recebe o array de computadores e exibe mensagem na tela.
     * @param computadores lista de computadores do cliente
     */
    public static void enviarPedido(ArrayList<Computador> computadores) {
        System.out.println("\nPedido enviado com sucesso! Total de itens: " + computadores.size());
    }
}
