import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a idade da " + (i + 1) + " pessoa: ");
            soma += scanner.nextInt();
        }

        double media = soma / 10;
        System.out.println("M dia das idades: " + media);
    }
}

