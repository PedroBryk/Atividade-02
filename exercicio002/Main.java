package exercicio002;

public class Main {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        int resultado1 = calc.soma(5, 10);
        double resultado2 = calc.soma(2.5, 3.7);
        int resultado3 = calc.soma(1, 2, 3);

        System.out.println("Soma de dois inteiros: " + resultado1);
        System.out.println("Soma de dois doubles: " + resultado2);
        System.out.println("Soma de três inteiros: " + resultado3);
        
    }
    
}
