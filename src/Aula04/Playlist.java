package Aula04;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> fila;
    private int indiceUrgente = 0;

    public Playlist(String nome){
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException();
        this.nome = nome;
        this.fila = new ArrayList<>();
    }

    public int tamanho() {
        return fila.size();
    }

    public void adicionar(Musica m) {
        if (m == null) throw new IllegalArgumentException();
        if (m.getPrioridade().equals("URGENTE")){
            fila.add(indiceUrgente, m);
            indiceUrgente++;
    } else {
        fila.add(m);
    }
}

    public Musica proximaMusica() {
        if (fila.isEmpty()){
            return null;
        }
        return fila.getFirst();
    }

    public Musica reproduzirProxima() {
        if (fila.isEmpty()) {
            return null;
        }
        return fila.removeFirst();
    }
    public void remover(String musica) {
        for (Musica m : fila){
            if (m.getTitulo().equals(musica)) {
                fila.remove(m);
                return;
            }
        }
    }
}

