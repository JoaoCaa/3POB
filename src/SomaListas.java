import java.util.ArrayList;
import java.util.Scanner;

public class SomaListas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaA = new ArrayList<>();
        ArrayList<Integer> listaB = new ArrayList<>();
        ArrayList<Integer> listaC = new ArrayList<>();

        System.out.println("Preencha a lista A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            listaA.add(scanner.nextInt());
        }

        System.out.println("\nPreencha a lista B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            listaB.add(scanner.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            listaC.add(listaA.get(i) + listaB.get(i));
        }

        System.out.println("\nConteúdo da lista C: " + listaC);

        scanner.close();
    }
}
