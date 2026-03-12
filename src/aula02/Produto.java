package aula02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Produto {

    String nome;
    double preco;
    int quantidade;
    LocalDateTime validade;

    public Produto(String nome, double preco, int quantidade, LocalDateTime validade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.validade = validade;

    }
    double getValorEmEstoque() {
        return quantidade * preco;
    }
    double getPreco(double desconto) {
        if (desconto < 1) {
            return preco * (1 - desconto);
        } else {
            return preco;
        }
    }
    String getValidadeStr() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return validade.format(formato);
    }
    public static void main(String[] args) {
        Produto arroz = new Produto(
                "arroz",
                25.0,
                10,
                LocalDateTime.of(2027, 3, 10, 23, 59)
        );
        System.out.println("Estoque do produto " + arroz.nome + " que vence em "
                + arroz.getValidadeStr() + " vale R$ " + arroz.getValorEmEstoque());
                System.out.println("Preco únitario sem desconto R$ " + arroz.preco + " / preco com desconto de 40% é R$ " + arroz.getPreco(0.4));

    }
}
