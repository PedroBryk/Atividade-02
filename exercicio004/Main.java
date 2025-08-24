package exercicio004;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        
        pedido.adicionarItem("Notebook", 1, 3500.0);
        pedido.adicionarItem("Mouse", 2, 150.0);
        pedido.adicionarItem("Teclado", 1, 300.0);

        
        pedido.removerItem("Mouse");


        System.out.println("Valor total: " + pedido.valorTotal());
    }
}
