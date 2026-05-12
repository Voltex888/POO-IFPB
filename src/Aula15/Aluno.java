package Aula15;

public class Aluno {
    private String nome;
    private int idade;
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nome + " - Com idade: " + idade + " - nota: " + nota;
    }
}
