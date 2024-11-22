import java.io.*;
import java.util.*;

public class HospitalApp {

    private static final String FILE_NAME = "pacientes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Paciente> pacientes = carregarPacientes();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Incluir Paciente");
            System.out.println("2. Alterar Paciente");
            System.out.println("3. Excluir Paciente");
            System.out.println("4. Consultar Pacientes");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    incluirPaciente(scanner, pacientes);
                    break;
                case 2:
                    alterarPaciente(scanner, pacientes);
                    break;
                case 3:
                    excluirPaciente(scanner, pacientes);
                    break;
                case 4:
                    consultarPacientes(pacientes);
                    break;
                case 5:
                    salvarPacientes(pacientes);
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static List<Paciente> carregarPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                pacientes.add(Paciente.fromString(line));
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar pacientes: " + e.getMessage());
        }
        return pacientes;
    }

    private static void salvarPacientes(List<Paciente> pacientes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Paciente paciente : pacientes) {
                writer.write(paciente.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar pacientes: " + e.getMessage());
        }
    }

    private static void incluirPaciente(Scanner scanner, List<Paciente> pacientes) {
        System.out.print("Número do paciente: ");
        int numero = scanner.nextInt();
        System.out.print("Peso do paciente: ");
        double peso = scanner.nextDouble();
        System.out.print("Altura do paciente: ");
        double altura = scanner.nextDouble();
        Paciente novoPaciente = new Paciente(numero, peso, altura);
        pacientes.add(novoPaciente);
        System.out.println("Paciente incluído com sucesso.");
    }

    private static void alterarPaciente(Scanner scanner, List<Paciente> pacientes) {
        System.out.print("Número do paciente a alterar: ");
        int numero = scanner.nextInt();
        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                System.out.print("Novo peso: ");
                paciente.setPeso(scanner.nextDouble());
                System.out.print("Nova altura: ");
                paciente.setAltura(scanner.nextDouble());
                System.out.println("Paciente alterado com sucesso.");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    private static void excluirPaciente(Scanner scanner, List<Paciente> pacientes) {
        System.out.print("Número do paciente a excluir: ");
        int numero = scanner.nextInt();
        Iterator<Paciente> iterator = pacientes.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getNumero() == numero) {
                iterator.remove();
                System.out.println("Paciente excluído com sucesso.");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    private static void consultarPacientes(List<Paciente> pacientes) {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            System.out.println("Lista de Pacientes:");
            for (Paciente paciente : pacientes) {
                paciente.listarPaciente();
            }
        }
    }
}
