package sistema.loja.model;

/**
 * Representa o sistema operacional de um computador.
 */
public class SistemaOperacional {
    private String nome;
    private int tipo; // 32 ou 64 bits

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
