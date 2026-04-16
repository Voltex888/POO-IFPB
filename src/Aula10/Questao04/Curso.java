package Aula10.Questao04;

public class Curso implements Avaliavel, Compravel {
    private String titulo, nomeInstrutor;
    private double notaMedia, preco;

    public Curso(String titulo, String nomeInstrutor, double notaMedia, double preco) {
        this.titulo = titulo;
        this.nomeInstrutor = nomeInstrutor;
        this.notaMedia = notaMedia;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }
    @Override
    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String gerarResumoPublico() {
        return "Título: " + titulo +
                "\n\tInstrutor: " + nomeInstrutor +
                "\n\tNota Média: " + notaMedia +
                "\n\tPreço: " + preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String gerarRecibo(String nomeComprador) {
        return gerarResumoPublico() +
                "\n\tNome do Comprador: " + nomeComprador;
    }
}
