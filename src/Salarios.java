import java.util.ArrayList;
import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> matriculas = new ArrayList<>();
        ArrayList<Double> salariosBrutos = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite a matrícula do empregado " + (i + 1) + ": ");
            matriculas.add(scanner.nextLine());
            System.out.print("Digite o salário bruto do empregado " + (i + 1) + ": ");
            salariosBrutos.add(scanner.nextDouble());
            scanner.nextLine(); 
        }

        System.out.println("\nDados dos empregados:");
        for (int i = 0; i < matriculas.size(); i++) {
            double desconto = salariosBrutos.get(i) * 0.11;
            double salarioLiquido = salariosBrutos.get(i) - desconto;
            System.out.println("Matrícula: " + matriculas.get(i) +
                               ", Salário Bruto: R$ " + salariosBrutos.get(i) +
                               ", Desconto: R$ " + desconto +
                               ", Salário Líquido: R$ " + salarioLiquido);
        }

        scanner.close();
    }
}
