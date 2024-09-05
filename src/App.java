import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Farenheit: ");
        double farenheit = scanner.nextDouble();

        double celsius = 5.0/9.0 * (farenheit - 32);

        System.out.println("A temperatura em Celsius é: " + celsius);
 
    }
}
