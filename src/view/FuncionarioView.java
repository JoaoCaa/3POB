package view;

import controller.FuncionarioController;
import model.Desenvolvedor;
import model.Gerente;
import model.GerenteDesenvolvedor;
import model.Treinador;

import java.util.Scanner;

public class FuncionarioView {
    private final FuncionarioController controller = new FuncionarioController();
    private final Scanner scanner = new Scanner(System.in);

    public void menu() {
        int opcao;
        do {
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Atualizar Funcionário");
            System.out.println("4. Excluir Funcionário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1 -> adicionarFuncionario();
                case 2 -> controller.listarFuncionarios();
                case 3 -> atualizarFuncionario();
                case 4 -> excluirFuncionario();
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }

    private void adicionarFuncionario() {
        System.out.println("Tipo de Funcionário (1-Desenvolvedor, 2-Gerente, 3-Treinador, 4-GerenteDesenvolvedor): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        switch (tipo) {
            case 1 -> controller.adicionarFuncionario(new Desenvolvedor(nome, salario));
            case 2 -> controller.adicionarFuncionario(new Gerente(nome, salario));
            case 3 -> controller.adicionarFuncionario(new Treinador(nome, salario));
            case 4 -> controller.adicionarFuncionario(new GerenteDesenvolvedor(nome, salario));
            default -> System.out.println("Tipo inválido.");
        }
    }

    private void atualizarFuncionario() {
        System.out.print("ID do Funcionário: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Novo Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Novo Salário: ");
        double salario = scanner.nextDouble();

        controller.atualizarFuncionario(id, nome, salario);
    }

    private void excluirFuncionario() {
        System.out.print("ID do Funcionário: ");
        int id = scanner.nextInt();
        controller.excluirFuncionario(id);
    }
}
