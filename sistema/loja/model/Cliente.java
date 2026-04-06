package sistema.loja.model;

/**
 * Representa um cliente que pode comprar vários computadores.
 */
public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int totalComputadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[20];
        this.totalComputadores = 0;
    }

    public float calculaTotalCompra() {
        float total = 0f;
        for (int i = 0; i < totalComputadores; i++) {
            total += computadores[i].getPreco();
        }
        return total;
    }

    public void addComputador(Computador pc) {
        if (totalComputadores < computadores.length) {
            computadores[totalComputadores] = pc;
            totalComputadores++;
        } else {
            System.out.println("Limite de computadores atingido!");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getTotalComputadores() {
        return totalComputadores;
    }

    public Computador[] getComputadores() {
        return computadores;
    }
}
