import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o nome da equipe de futebol? ");
        String equipe = scanner.next();

        System.out.print("Quantas derrotas a equipe obteve? ");
        int derrotas = scanner.nextInt();
        System.out.print("Quantos empates a equipe obteve? ");
        int empates = scanner.nextInt();
        System.out.print("Quantas vitórias a equipe obteve? ");
        int vitorias = scanner.nextInt();

        int pontosGanhos = vitorias * 3 + empates;
        int pontosPerdidos = derrotas * 3;

        System.out.println("A equipe " + equipe + " ganhou " + pontosGanhos + " pontos e perdeu " + pontosPerdidos + " pontos.");
 
    }
}
