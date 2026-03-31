package Aula07.Restaurante;

import java.util.Collection;

public class ItemPedido {
    private String nomePrato;
    private double preco;
    private int quantidade;

    public ItemPedido(String nomePrato, double preco, int quantidade) {
        this.nomePrato = nomePrato;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNomePrato() {
        return nomePrato;
    }
    public double getTotal(){
        return preco * quantidade;
    }
    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String linha() {
        return quantidade + "x " + nomePrato + " — R$" + String.format("%.2f", preco);
    }
}
