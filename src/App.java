import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> sexo = new HashMap<>();
        sexo.put("M", 0);
        sexo.put("F", 0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o sexo ('F' para feminino ou 'M' para masculino), ou 'S' para sair: ");
        String linha = scanner.nextLine();
        while (!linha.equalsIgnoreCase("S")) {
            sexo.put(linha, sexo.get(linha) + 1);
            System.out.println("Digite o sexo ('F' para feminino ou 'M' para masculino), ou 'S' para sair: ");
            linha = scanner.nextLine();
        }
        System.out.println("Total de pessoas cadastradas: " + (sexo.get("M") + sexo.get("F")));
        System.out.println("Total de pessoas de sexo M: " + sexo.get("M"));
        System.out.println("Total de pessoas de sexo F: " + sexo.get("F"));
    }
}

