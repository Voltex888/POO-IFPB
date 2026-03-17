package aula04;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    public List<Musica> fila;

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
            int i = 0;

          while (i < fila.size() && fila.get(i).getPrioridade().equals("URGENTE")) {
            i++;
        }

        fila.add(i, m);
    } else {
        fila.add(m);
    }
}

    public Musica proximaMusica() {
        if (fila.isEmpty()){
            return null;
        }
        return fila.get(0);
    }

    public Musica reproduzirProxima() {
        if (fila.isEmpty()) {
            return null;
        }
        return fila.remove(0);
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

