package Aula10.Questao04;

public class Instrutor implements Avaliavel {
    private String nome, especialidade;
    private double notaMedia;

    public Instrutor(String nome, String especialidade, double notaMedia) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.notaMedia = notaMedia;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String gerarResumoPublico() {
        return "Nome: " + nome +
                "\n\tEspecialidade : " + especialidade +
                "\n\tNota Média: " + notaMedia;
    }
}
