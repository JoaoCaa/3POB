import java.util.ArrayList;
import java.util.Scanner;

public class PacienteCRUD {
    private ArrayList<Paciente> pacientes;
    private Scanner scanner;

    public PacienteCRUD() {
        pacientes = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarPaciente() {
        System.out.println("Digite o número do paciente:");
        int numero = scanner.nextInt();
        System.out.println("Digite o peso do paciente (kg):");
        double peso = scanner.nextDouble();
        System.out.println("Digite a altura do paciente (m):");
        double altura = scanner.nextDouble();

        Paciente paciente = new Paciente(numero, peso, altura);
        pacientes.add(paciente);
        System.out.println("Paciente adicionado com sucesso!");
    }

    public void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            System.out.println("Lista de pacientes:");
            for (Paciente p : pacientes) {
                p.listarPaciente();
            }
        }
    }

    public void alterarPaciente() {
        System.out.println("Digite o número do paciente que deseja alterar:");
        int numero = scanner.nextInt();
        for (Paciente p : pacientes) {
            if (p.getNumero() == numero) {
                System.out.println("Paciente encontrado! Informe os novos dados:");
                System.out.println("Novo peso (kg):");
                double novoPeso = scanner.nextDouble();
                System.out.println("Nova altura (m):");
                double novaAltura = scanner.nextDouble();
                p.setPeso(novoPeso);
                p.setAltura(novaAltura);
                System.out.println("Dados alterados com sucesso!");
                return;
            }
        }
        System.out.println("Paciente com número " + numero + " não encontrado.");
    }

    public void excluirPaciente() {
        System.out.println("Digite o número do paciente que deseja excluir:");
        int numero = scanner.nextInt();
        for (Paciente p : pacientes) {
            if (p.getNumero() == numero) {
                pacientes.remove(p);
                System.out.println("Paciente excluído com sucesso!");
                return;
            }
        }
        System.out.println("Paciente com número " + numero + " não encontrado.");
    }

    public void executar() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Listar Pacientes");
            System.out.println("3. Alterar Paciente");
            System.out.println("4. Excluir Paciente");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarPaciente();
                    break;
                case 2:
                    listarPacientes();
                    break;
                case 3:
                    alterarPaciente();
                    break;
                case 4:
                    excluirPaciente();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
    }

    public static void main(String[] args) {
        PacienteCRUD sistema = new PacienteCRUD();
        sistema.executar();
    }
}
