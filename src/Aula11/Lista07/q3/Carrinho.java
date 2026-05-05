package Aula11.Lista07.q3;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> itens = new ArrayList<>();
    private double valorFrete;

    public void adicionarItem(Item item) {
        itens.add(item);
    }
    public List<Item> getItens() {
        return itens;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public double obterMelhorDesconto(List<Regra> regras) {
//        Carrinho carrinho = this;
//        regras.sort(new Comparator<Regra>() {
//            @Override
//            public int compare(Regra o1, Regra o2) {
//                return (int)(o1.getDesconto(carrinho) - o2.getDesconto(carrinho));
//            }
//        });

//        return regras.getFirst().getDesconto(carrinho);
        double melhorDesconto = 0;

        for (Regra regra : regras) {
            double desconto = regra.getDesconto(this);
            if (desconto > melhorDesconto) {
                melhorDesconto = desconto;
            }
        }

        return melhorDesconto;
    }

    static void main() {
        Carrinho carrinho = new Carrinho();
        carrinho.valorFrete = 70;
        carrinho.adicionarItem(new Item("A", 25, 4));
        carrinho.adicionarItem(new Item("B", 10, 40));

        List<Regra> regras = new ArrayList<>();
        regras.add(new RegraDescontoSegundaUnidade());
        regras.add(new RegraFreteGratis());
        regras.add(new RegraDescontoValorMinimo());

        System.out.println(carrinho.obterMelhorDesconto(regras));
    }
}
