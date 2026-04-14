package Aula10.Questao03;

public class Audiobook extends Produto{
    private int duracaoMinutos;
    private String narrador;

    public Audiobook(String titulo, String autor, double preco, int duracaoMinutos, String narrador) {
        super(titulo, autor, preco);
        this.duracaoMinutos = duracaoMinutos;
        this.narrador = narrador;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public String getNarrador() {
        return narrador;
    }

    @Override
    public String toString() {
        return "Audiobook: " +
                super.toString() +
                "\n\tduracaoMinutos: " + duracaoMinutos +
                "\n\t, narrador: '" + narrador +
                '}';
    }
}
