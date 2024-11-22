import java.util.ArrayList;
import java.util.Scanner;

public class MaiorNumeroLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        int maior = numeros.get(0), ocorrencias = 0;
        ArrayList<Integer> posicoes = new ArrayList<>();

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > maior) {
                maior = numeros.get(i);
                ocorrencias = 1;
                posicoes.clear();
                posicoes.add(i);
            } else if (numeros.get(i) == maior) {
                ocorrencias++;
                posicoes.add(i);
            }
        }

        System.out.println("\nMaior número: " + maior);
        System.out.println("Ocorrências: " + ocorrencias);
        System.out.println("Posições: " + posicoes);

        scanner.close();
    }
}
