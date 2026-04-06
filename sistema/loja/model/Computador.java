package sistema.loja.model;

/**
 * Representa um computador com seus componentes.
 */
public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardwareBasico;
    private int totalHardware;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
        this.hardwareBasico = new HardwareBasico[10];
        this.totalHardware = 0;
        this.sistemaOperacional = null;
        this.memoriaUSB = null;
    }

    public void mostraPCConfigs() {
        System.out.println("  Marca: " + marca);
        System.out.println("  Preco: R$ " + String.format("%.2f", preco));
        System.out.println("  Hardware Basico:");
        for (int i = 0; i < totalHardware; i++) {
            System.out.println("    - " + hardwareBasico[i].getNome()
                    + " (" + hardwareBasico[i].getCapacidade() + ")");
        }
        if (sistemaOperacional != null) {
            System.out.println("  Sistema Operacional: " + sistemaOperacional.getNome()
                    + " (" + sistemaOperacional.getTipo() + " bits)");
        }
        if (memoriaUSB != null) {
            System.out.println("  Memoria USB: " + memoriaUSB.getNome()
                    + " - " + memoriaUSB.getCapacidade() + " GB");
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public void addHardwareBasico(HardwareBasico hb) {
        if (totalHardware < hardwareBasico.length) {
            hardwareBasico[totalHardware] = hb;
            totalHardware++;
        }
    }

    public void setSistemaOperacional(SistemaOperacional so) {
        this.sistemaOperacional = so;
    }

    public float getPreco() {
        return preco;
    }
}
