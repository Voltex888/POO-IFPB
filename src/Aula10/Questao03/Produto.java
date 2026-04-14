package Aula10.Questao03;

import java.util.Objects;

public class Produto {
    private String titulo, autor;
    private double preco;

    public Produto(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "\n\ttitulo: '" + titulo +
                "\n\t, autor: '" + autor +
                "\n\t, preco: " + preco +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Produto produto = (Produto) obj;
        return Double.compare(preco, produto.preco) == 0 && Objects.equals(titulo, produto.titulo) && Objects.equals(autor, produto.autor);
    }

}
