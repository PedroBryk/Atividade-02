package exercicio003;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void listarFuncionarios() {
        System.out.println("Departamento: " + nome);
        for (Funcionario f : funcionarios) {
            System.out.println("  " + f);
        }
        System.out.println();
    }
}
