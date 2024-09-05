import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código da turma: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade de alunos do sexo masculino: ");
        int masculino = scanner.nextInt();

        System.out.print("Digite a quantidade de alunos do sexo feminino: ");
        int feminino = scanner.nextInt();

        System.out.print("Digite a quantidade de alunos aprovados: ");
        int aprovados = scanner.nextInt();

        double total = masculino + feminino;

        double porcentagemMasculino = (masculino / total) * 100;
        double porcentagemFeminino = (feminino / total) * 100;
        double porcentagemReprovados = (total - aprovados) / total * 100;

        System.out.println("O código da turma é: " + codigo);
        System.out.println("A porcentagem de alunos do sexo masculino é: " + String.format("%.2f", porcentagemMasculino) + "%");
        System.out.println("A porcentagem de alunos do sexo feminino é: " + String.format("%.2f", porcentagemFeminino) + "%");
        System.out.println("A porcentagem de alunos reprovados é: " + String.format("%.2f", porcentagemReprovados) + "%");
        System.out.println("O total de alunos da turma é: " + total);
 
    }
}
