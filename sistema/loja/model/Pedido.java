package sistema.loja.model;

/**
 * Representa um pedido de compra.
 */
public class Pedido {
    private long data;
    private Cliente cliente;
    private float valorTotal;

    public Pedido(Cliente cliente) {
        this.data = System.currentTimeMillis();
        this.cliente = cliente;
        this.valorTotal = cliente.calculaTotalCompra();
    }

    public float getValorTotal() {
        return valorTotal;
    }
}
