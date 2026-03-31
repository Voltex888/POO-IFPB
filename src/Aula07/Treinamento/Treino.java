package Aula07.Treinamento;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Treino {
    private Usuario usuario;
    private List<Serie> series;

    public Treino(Usuario usuario) {
        this.usuario = usuario;
        this.series = new ArrayList<>();
    }
    public void adicionarSerie(Serie s) {
        series.add(s);
    }
    public void adicionarSerie(String exercicio, int repeticoes, double cargaKg) {
        series.add(new Serie(exercicio, repeticoes, cargaKg));
    }

    public double calcularVolume() {
        return calcularVolume(null);
    }
    public double calcularVolume(String nomeExercicio){
        return calcularVolumeFiltrado(nomeExercicio);
    }
    private double calcularVolumeFiltrado(String nomeExercicio){
        double total = 0;
        for (Serie s : series) {
            if(nomeExercicio == null || s.getNomeExercicio().equals(nomeExercicio)){
                total += s.getVolume();
            }
        }
        return total;
    }
    public int fcMaxima() {
        if (usuario.getSexo().equals("M")) {
            return 220 - usuario.getIdade();
        }
        else if (usuario.getSexo().equals("F")){
            return 226 - usuario.getIdade();
        }
        return 0;
    }

    public String avaliar() {
        double imc = usuario.calcularIMC();
    if (29.9 >= imc && imc >= 18.5) {
        if(calcularVolume() >= 1000){
        return "Treino adequado";
        }
        return "Aumentar carga";
        }
    return "Consulte um profissional";
    }
    public String relatorio(){
        StringBuilder texto = new StringBuilder();
        texto.append(usuario.resumo());
        for (Serie s : series){
            texto.append(s.linha());
            texto.append(s.getVolume());
        }
        return texto.toString();
    }
}
