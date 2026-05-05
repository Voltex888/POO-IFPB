package Aula13.Exercicios.Questao01;

public class ConversorDeNotas {
    private double nota;
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
    public static String obterConceito(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException(
                    "Nota inválida: " + nota + ". Informe um valor entre 0.0 e 10.0."
            );
        }
        if (nota >= 9) return "A";
        if (nota >= 7) return "B";
        if (nota >= 5) return "C";
        return "D";
    }
}

