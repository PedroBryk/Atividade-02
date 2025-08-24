package exercicio003;


public class Main {
    public static void main(String[] args) {
       
        Departamento ti = new Departamento("TI");
        Departamento rh = new Departamento("RH");

        
        Funcionario f1 = new Funcionario("Pedro Bryk", 5000.0, ti);
        Funcionario f2 = new Funcionario("Maria Silva", 4500.0, rh);
        Funcionario f3 = new Funcionario("João Souza", 4800.0, ti);

       
        ti.adicionarFuncionario(f1);
        ti.adicionarFuncionario(f3);
        rh.adicionarFuncionario(f2);

        
        ti.listarFuncionarios();
        rh.listarFuncionarios();
    }
}
