package Aula11.Lista07.q3;

public class RegraFreteGratis implements Regra {
    @Override
    public double getDesconto(Carrinho carrinho) {
        int quantidade = 0;

        for (Item i : carrinho.getItens()) {
            quantidade += i.quantidade;
        }
        if (quantidade > 5) {
            return carrinho.getValorFrete();
        }

        return 0;
    }
}
