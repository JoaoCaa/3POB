public class MainEmpresa {
    public static void main(String[] args) {
        Vendas vendedor = new Vendas("001", "123.456.789-00", "Ana Souza", 5000.0f, 1000.0f, 2000.0f);

        System.out.println("Vendedor: " + vendedor.getNome() +
                           ", Salário: " + vendedor.getSalario() +
                           ", Participação nos Lucros: " + vendedor.getParticipacaoLucros());
    }
}
