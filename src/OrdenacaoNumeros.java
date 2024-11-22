import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenacaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        ArrayList<Integer> crescente = new ArrayList<>(numeros);
        ArrayList<Integer> decrescente = new ArrayList<>(numeros);
        Collections.sort(crescente);
        Collections.sort(decrescente, Collections.reverseOrder());

        System.out.println("\nOrdem crescente: " + crescente);
        System.out.println("Ordem decrescente: " + decrescente);

        scanner.close();
    }
}
