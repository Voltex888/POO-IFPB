package Aula13.Exercicios.Questao01;

public class ConversorDeNotas {
    private double nota;
    private char faixa;
    public ConversorDeNotas() {
    }

    public ConversorDeNotas(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public void obterFaixa(){

        if (nota >= 9 && nota <= 10){
            faixa = 'A';
        }
        if (nota >= 7 && nota <= 8.9){
            faixa = 'B';
        }
        if (nota >= 5 && nota <= 6.9){
            faixa = 'C';
        }
        if (nota < 5 && nota >= 0 ) {
            faixa = 'D';
        }
        System.out.println(faixa);

    }
    public void obterConceito(double nota){
        if (nota > 10 && nota < 0) throw new IllegalArgumentException();
        obterFaixa();
    }
}

