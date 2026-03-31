package Aula07.Restaurante;

public class Restaurante {
    private String nome, categoria;
    private double notaAvaliacao;

    public Restaurante(String nome, String categoria, double notaAvaliacao) {
        this.nome = nome;
        this.categoria = categoria;
        this.notaAvaliacao = notaAvaliacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public String info() {
        return nome + " | " + categoria + " | ★ " + notaAvaliacao;
    }
}
