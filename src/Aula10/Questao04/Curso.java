package Aula10.Questao04;

public class Curso implements Avaliavel, Pagavel{
    private String titulo, nomeInstrutor;
    private double notaMedia, preco;

    public Curso(String titulo, String nomeInstrutor, double notaMedia, double preco) {
        this.titulo = titulo;
        this.nomeInstrutor = nomeInstrutor;
        this.notaMedia = notaMedia;
        this.preco = preco;
    }

    @Override
    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String gerarResumoPublico() {
        return "";
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public double gerarRecibo(String nomeComprador) {
        return 0;
    }
}
