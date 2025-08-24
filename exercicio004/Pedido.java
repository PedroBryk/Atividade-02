package exercicio004;

import java.util.ArrayList;

public class Pedido {
    ArrayList<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String produto, int quantidade, double precoUnitario) {
        itens.add(new ItemPedido(produto, quantidade, precoUnitario));
    }

    public void removerItem(String produto) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).produto.equalsIgnoreCase(produto)) {
                itens.remove(i);
                break;
            }
        }
    }

    public double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.quantidade * item.precoUnitario;
        }
        return total;
    }
}