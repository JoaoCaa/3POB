import java.util.ArrayList;
import java.util.Scanner;

public class ConsultaPorCodigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> codigos = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> telefones = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o código da pessoa " + (i + 1) + ": ");
            codigos.add(scanner.nextInt());
            scanner.nextLine(); 
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
            System.out.print("Digite o telefone da pessoa " + (i + 1) + ": ");
            telefones.add(scanner.nextLine());
        }

        while (true) {
            System.out.print("\nDigite o código para consulta (-1 para sair): ");
            int consulta = scanner.nextInt();
            if (consulta == -1) break;

            if (codigos.contains(consulta)) {
                int index = codigos.indexOf(consulta);
                System.out.println("Nome: " + nomes.get(index) + ", Telefone: " + telefones.get(index));
            } else {
                System.out.println("Código não encontrado.");
            }
        }

        scanner.close();
    }
}
