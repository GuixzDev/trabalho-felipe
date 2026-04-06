import java.util.ArrayList;

/**
 * Representa um cliente que pode comprar vários computadores.
 */
public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Computador> computadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new ArrayList<>();
    }

    /**
     * Calcula o valor total da compra somando todos os computadores.
     */
    public float calculaTotalCompra() {
        float total = 0f;
        for (Computador pc : computadores) {
            total += pc.getPreco();
        }
        return total;
    }

    /**
     * Adiciona um computador à lista de compras do cliente.
     */
    public void addComputador(Computador pc) {
        computadores.add(pc);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Computador> getComputadores() {
        return computadores;
    }
}
