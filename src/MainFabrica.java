public class MainFabrica {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Rua A, 123", "1234-5678", "123.456.789-00", "João Silva");
        PessoaJuridica pj = new PessoaJuridica("Rua B, 456", "9876-5432", "12.345.678/0001-00", "Empresa XYZ");

        System.out.println("Pessoa Física: " + pf.getNome() + ", CPF: " + pf.getCpf());
        System.out.println("Pessoa Jurídica: " + pj.getRazaoSocial() + ", CNPJ: " + pj.getCnpj());
    }
}
