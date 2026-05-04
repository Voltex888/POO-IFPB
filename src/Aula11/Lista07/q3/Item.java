package Aula11.Lista07.q3;

public class Item {
    private String nome;
    private Double valor;
    private int quantidade;

    public Item(String nome, Double precoUnitario, int quantidade) {
        this.nome = nome;
        this.valor = precoUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getTotal() {
        return valor * quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Double getValor() {
        return valor;
    }
}
