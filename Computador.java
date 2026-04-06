import java.util.ArrayList;

/**
 * Representa um computador com seus componentes.
 */
public class Computador {
    private String marca;
    private float preco;
    private ArrayList<HardwareBasico> hardwareBasico;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB; // opcional

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
        this.hardwareBasico = new ArrayList<>();
        this.memoriaUSB = null;
    }

    /**
     * Exibe todas as configurações do computador no console.
     */
    public void mostraPCConfigs() {
        System.out.println("  Marca: " + marca);
        System.out.println("  Preço: R$ " + String.format("%.2f", preco));
        System.out.println("  Hardware Básico:");
        for (HardwareBasico hb : hardwareBasico) {
            System.out.println("    - " + hb.getNome() + " (" + hb.getCapacidade() + ")");
        }
        System.out.println("  Sistema Operacional: " + sistemaOperacional.getNome()
                + " (" + sistemaOperacional.getTipo() + " bits)");
        if (memoriaUSB != null) {
            System.out.println(" Memória USB: " + memoriaUSB.getNome()
                    + " - " + memoriaUSB.getCapacidade() + " GB");
        }
    }

    /**
     * Adiciona uma memória USB opcional ao computador.
     */
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    /**
     * Adiciona um componente de hardware básico ao computador.
     */
    public void addHardwareBasico(HardwareBasico hb) {
        hardwareBasico.add(hb);
    }

    /**
     * Define o sistema operacional do computador.
     */
    public void setSistemaOperacional(SistemaOperacional so) {
        this.sistemaOperacional = so;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public ArrayList<HardwareBasico> getHardwareBasico() {
        return hardwareBasico;
    }

    public SistemaOperacional getSistemaOperacional() {
        return sistemaOperacional;
    }

    public MemoriaUSB getMemoriaUSB() {
        return memoriaUSB;
    }
}
