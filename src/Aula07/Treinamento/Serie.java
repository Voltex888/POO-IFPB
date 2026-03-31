package Aula07.Treinamento;

import java.util.Collection;

public class Serie {
    private String nomeExercicio;
    private int repeticoes;
    private double cargaKg;

    public Serie(String nomeExercicio, int repeticoes, double cargaKg) {
        this.nomeExercicio = nomeExercicio;
        this.repeticoes = repeticoes;
        this.cargaKg = cargaKg;
    }

    public String getNomeExercicio() {
        return nomeExercicio;
    }

    public void setNomeExercicio(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public double getCargaKg() {
        return cargaKg;
    }

    public void setCargaKg(double cargaKg) {
        this.cargaKg = cargaKg;
    }
    public double getVolume(){
        return cargaKg * repeticoes;
    }
    public String linha() {
        return "Serie{" +
                "nomeExercicio='" + nomeExercicio + '\'' +
                ", repeticoes=" + repeticoes +
                ", cargaKg=" + cargaKg +
                '}';
    }
}
