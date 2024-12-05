package controller;

import model.Funcionario;

import java.io.*;
import java.util.ArrayList;

public class FuncionarioController {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private final String arquivo = "dados/funcionarios.txt";

    public FuncionarioController() {
        carregarDados();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        salvarDados();
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDetalhes();
        }
    }

    public void atualizarFuncionario(int id, String novoNome, double novoSalario) {
        if (id >= 0 && id < funcionarios.size()) {
            Funcionario funcionario = funcionarios.get(id);
            funcionario.setNome(novoNome);
            funcionario.setSalario(novoSalario);
            salvarDados();
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void excluirFuncionario(int id) {
        if (id >= 0 && id < funcionarios.size()) {
            funcionarios.remove(id);
            salvarDados();
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private void salvarDados() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(funcionarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void carregarDados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            funcionarios = (ArrayList<Funcionario>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            funcionarios = new ArrayList<>();
        }
    }
}
