import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos games foram vendidos hoje? ");
        int games = scanner.nextInt();

        System.out.print("Quantas calculadoras foram vendidas hoje? ");
        int calculadoras = scanner.nextInt();

        System.out.print("Quantas canetas foram vendidas hoje? ");
        int canetas = scanner.nextInt();

        System.out.print("Qual o preço de cada game? ");
        double precoGame = scanner.nextDouble();

        System.out.print("Qual o preço de cada calculadora? ");
        double precoCalculadora = scanner.nextDouble();

        System.out.print("Qual o preço de cada caneta? ");
        double precoCaneta = scanner.nextDouble();

        double totalGames = games * precoGame;
        double totalCalculadoras = calculadoras * precoCalculadora;
        double totalCanetas = canetas * precoCaneta;
        double totalFaturamento = totalGames + totalCalculadoras + totalCanetas;

        System.out.println("O total do faturamento com games foi de R$" + totalGames);
        System.out.println("O total do faturamento com calculadoras foi de R$" + totalCalculadoras);
        System.out.println("O total do faturamento com canetas foi de R$" + totalCanetas);
        System.out.println("O total do faturamento foi de R$" + totalFaturamento);
 
 
    }
}
