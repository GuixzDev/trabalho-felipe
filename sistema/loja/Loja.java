package sistema.loja;

import java.util.Scanner;
import sistema.loja.model.Cliente;
import sistema.loja.model.Computador;
import sistema.loja.model.HardwareBasico;
import sistema.loja.model.SistemaOperacional;
import sistema.loja.model.MemoriaUSB;
import sistema.loja.model.Pedido;
import sistema.loja.util.ProcessarPedido;

/**
 * Classe principal com o menu interativo do sistema de compra de computadores.
 */
public class Loja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Cadastro do cliente ---
        System.out.println("===== SISTEMA DE COMPRA DE COMPUTADORES =====\n");

        System.out.print("Informe o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Informe o CPF do cliente: ");
        String cpf = sc.nextLine();

        Cliente cliente = new Cliente(nome, cpf);

        // --- Menu de compras ---
        int opcao;
        do {
            System.out.println("\n--- Menu de Promocoes ---");
            System.out.println("1 - Promocao 1 (Apple)");
            System.out.println("2 - Promocao 2 (Samsung)");
            System.out.println("3 - Promocao 3 (Dell)");
            System.out.print("0 - Finalizar compra\n>> ");

            opcao = sc.nextInt();
            sc.nextLine();

            Computador pc = null;

            switch (opcao) {
                case 1:
                    pc = criarPromocao1();
                    break;
                case 2:
                    pc = criarPromocao2();
                    break;
                case 3:
                    pc = criarPromocao3();
                    break;
                case 0:
                    System.out.println("\nFinalizando a compra...\n");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }

            if (pc != null) {
                cliente.addComputador(pc);
                System.out.println("Computador adicionado com sucesso!");
            }
        } while (opcao != 0);

        // --- Resumo final ---
        exibirResumo(cliente);

        sc.close();
    }

    /**
     * Exibe o resumo da compra com dados do cliente, PCs e valor total.
     */
    public static void exibirResumo(Cliente cliente) {
        System.out.println("\n========== RESUMO DA COMPRA ==========");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Total de computadores: " + cliente.getTotalComputadores());

        if (cliente.getTotalComputadores() == 0) {
            System.out.println("Nenhum computador foi comprado.");
        } else {
            System.out.println("\n--- Computadores Comprados ---");
            int i = 1;
        }

        System.out.println("\n========================================");
        System.out.println("VALOR TOTAL DA COMPRA: R$ " + String.format("%.2f", cliente.calculaTotalCompra()));
        System.out.println("========================================");

        // Cria o pedido e processa
        Pedido pedido = new Pedido(cliente);
        ProcessarPedido.enviarPedido(cliente.getComputadores(), cliente.getTotalComputadores());
    }

    // ========== MÉTODOS DE CRIAÇÃO DAS PROMOÇÕES ==========

    /**
     * Promocao 1: Apple - Core i3, 8GB RAM, 500GB HD, macOS Sequoia, USB 16GB
     */
    public static Computador criarPromocao1() {
        Computador pc = new Computador("Apple", 566.0f);
        pc.addHardwareBasico(new HardwareBasico("Processador Core i3", 2200f));
        pc.addHardwareBasico(new HardwareBasico("RAM", 8f));
        pc.addHardwareBasico(new HardwareBasico("HD", 500f));
        pc.setSistemaOperacional(new SistemaOperacional("macOS Sequoia", 64));
        pc.addMemoriaUSB(new MemoriaUSB("USB Flash Drive", 16));
        return pc;
    }

    /**
     * Promocao 2: Samsung - Core i5, 16GB RAM, 1TB HD, Windows 8, USB 32GB
     */
    public static Computador criarPromocao2() {
        Computador pc = new Computador("Samsung", 1800.0f);
        pc.addHardwareBasico(new HardwareBasico("Processador Core i5", 3370f));
        pc.addHardwareBasico(new HardwareBasico("RAM", 16f));
        pc.addHardwareBasico(new HardwareBasico("HD", 1000f));
        pc.setSistemaOperacional(new SistemaOperacional("Windows 8", 64));
        pc.addMemoriaUSB(new MemoriaUSB("USB Flash Drive", 32));
        return pc;
    }

    /**
     * Promocao 3: Dell - Core i7, 32GB RAM, 2TB HD, Windows 10, HD Externo 1TB
     */
    public static Computador criarPromocao3() {
        Computador pc = new Computador("Dell", 6244.0f);
        pc.addHardwareBasico(new HardwareBasico("Processador Core i7", 4500f));
        pc.addHardwareBasico(new HardwareBasico("RAM", 32f));
        pc.addHardwareBasico(new HardwareBasico("HD", 2000f));
        pc.setSistemaOperacional(new SistemaOperacional("Windows 10", 64));
        pc.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));
        return pc;
    }
}
