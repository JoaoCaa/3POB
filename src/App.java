import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a matricula: ");
        String matrícula = scanner.nextLine();

        System.out.print("Digite o salario: ");
        String salario = scanner.nextLine();

        System.out.print("Digite a matricula do segundo: ");
        String matrícula2 = scanner.nextLine();

        System.out.print("Digite o salario do segundo: ");
        String salario2 = scanner.nextLine();

        double desconto = Double.parseDouble(salario) * 0.05;
        double acrescimo = Double.parseDouble(salario2) * 0.09;

        double salarioFinal1 = Double.parseDouble(salario) - desconto;
        double salarioFinal2 = Double.parseDouble(salario2) + acrescimo;

        System.out.println("o funcionario " + matrícula + " tem o desconto: " + desconto);
        System.out.println("Salário final do primeiro: " + salarioFinal1);
        
        System.out.println("o segundo funcionario " + matrícula2 + " tem o acrescimo: " + acrescimo);
        System.out.println("Salário final do segundo: " + salarioFinal2);
    }
}
