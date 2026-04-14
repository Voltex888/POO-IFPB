package Aula10.Questao04;

public class TrilhaDeApredizado implements Avaliavel{
    private String nome;
    private int numeroCursos;
    private double notaMedia;

    public TrilhaDeApredizado(String nome, int numeroCursos, double notaMedia) {
        this.nome = nome;
        this.numeroCursos = numeroCursos;
        this.notaMedia = notaMedia;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroCursos() {
        return numeroCursos;
    }

    @Override
    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String gerarResumoPublico() {
        return "";
    }
}
