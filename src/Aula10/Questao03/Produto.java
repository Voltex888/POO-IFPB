package Aula10.Questao03;

import Aula10.Questao02.Personagem;

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

    public boolean equals(Produto obj) {
        return obj.getTitulo().equals(titulo) && obj.getAutor().equals(autor);
    }
}
