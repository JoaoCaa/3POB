import java.util.ArrayList;
import java.util.Scanner;

public class NumerosNegPosNulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int negativos = 0, positivos = 0, nulos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);

            if (numero < 0) negativos++;
            else if (numero > 0) positivos++;
            else nulos++;
        }

        System.out.println("\nNegativos: " + negativos);
        System.out.println("Positivos: " + positivos);
        System.out.println("Nulos: " + nulos);

        scanner.close();
    }
}
