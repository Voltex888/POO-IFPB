package Aula07.Restaurante;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Pedido {
    private Restaurante restaurante;
    private String nomeCliente;
    private double distanciaKm;
    private List<ItemPedido> pedidos;

    public Pedido(String nomeCliente, Restaurante restaurante, double distanciaKm) {
        this.restaurante = restaurante;
        this.nomeCliente = nomeCliente;
        this.distanciaKm = distanciaKm;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        pedidos.add(item);
    }

    public void adicionarItem(String nomePrato, double preco, int quantidade) {
        pedidos.add(new ItemPedido(nomePrato, preco, quantidade));
    }

    public double calcularSubtotal() {
        double total = 0;
        for (ItemPedido p : pedidos) {
            total += p.getTotal();
        }
        return total;
    }

    public double calcularTotal() {
        double taxa = 2.00 + (1.5 * distanciaKm);
        return calcularSubtotal() + taxa;
    }
    public double calcularTotal(String tipoEntrega) {
        double subtotal = calcularSubtotal();

        if (tipoEntrega.equalsIgnoreCase("retirada")) {
            return subtotal;
        }
        double taxa = 2.00 + (1.5 * distanciaKm);
        if (tipoEntrega.equalsIgnoreCase("expressa")) {
            taxa *= 2;
        }
        return subtotal + taxa;
    }
    public double calcularTotal(String tipoEntrega, double cupomDesconto) {
        double total = calcularTotal(tipoEntrega);
        total -= cupomDesconto;

        if (total < 0){
            return 0;
        }
        return total;
    }
    public String resumoPedido() {
        String texto = "Cliente: " + nomeCliente + "\n";

        texto += "Restaurante: " + restaurante.info() + "\n";
        texto += "Itens:\n";

        for (ItemPedido item : pedidos) {
            texto += "- " + item.linha() + "\n";
        }

        texto += "Subtotal: R$" + String.format("%.2f", calcularSubtotal()) + "\n";
        texto += "Total: R$" + String.format("%.2f", calcularTotal());

        return texto;
    }
}
