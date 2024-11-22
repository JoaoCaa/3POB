// Classe base Funcionario
public class Funcionario {
    private String matricula;
    private String cpf;
    private String nome;
    private float salario;

    public Funcionario(String matricula, String cpf, String nome, float salario) {
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

// Subclasse Gerente
class Gerente extends Funcionario {
    private float gratificacao;

    public Gerente(String matricula, String cpf, String nome, float salario, float gratificacao) {
        super(matricula, cpf, nome, salario);
        this.gratificacao = gratificacao;
    }

    // Getters e Setters
    public float getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(float gratificacao) {
        this.gratificacao = gratificacao;
    }
}

// Subclasse Vendas
class Vendas extends Gerente {
    private float participacaoLucros;

    public Vendas(String matricula, String cpf, String nome, float salario, float gratificacao, float participacaoLucros) {
        super(matricula, cpf, nome, salario, gratificacao);
        this.participacaoLucros = participacaoLucros;
    }

    // Getters e Setters
    public float getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(float participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }
}
