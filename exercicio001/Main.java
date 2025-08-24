package exercicio001;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        // Criando 3 alunos
        alunos.add(new Aluno("Pedro Bryk", "2025001", "Engenharia de Software"));
        alunos.add(new Aluno("Maria Silva", "2025002", "Medicina"));
        alunos.add(new Aluno("João Souza", "2025003", "Direito"));

        // Imprimindo os dados
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
        
    }
}
