package Aula12;

public class RegraDescontoValorMinimo implements Regra {
    @Override
    public double getDesconto(Carrinho carrinho) {
        double subtotal = 0;

        for (Item item : carrinho.getItens()) {
            subtotal += item.getPrecoUnitario() * item.getQuantidade();
        }

        if (subtotal > 300) {
            return subtotal * 0.1;
        }

        return 0;
    }
}
