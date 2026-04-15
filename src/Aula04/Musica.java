package Aula04;

public class Musica {
    private String titulo;
    private String artista;
    private int duracaoSegundos;
    private String prioridade;

    public Musica(String titulo, String artista, int duracaoSegundos, String prioridade) {
        if (titulo == null || artista == null || titulo.isEmpty() || artista.isEmpty()) {
            throw new IllegalArgumentException();
        }

        if (duracaoSegundos <= 0) {
            throw new IllegalArgumentException();
        }

        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
        setPrioridade(prioridade);
    }

    public void setPrioridade(String prioridade) {
        if (prioridade == null || prioridade.isBlank() || prioridade.isEmpty()) throw new IllegalArgumentException();
        if (!prioridade.equals("NORMAL") && !prioridade.equals("URGENTE")) {
            throw new IllegalArgumentException();
        }
        this.prioridade = prioridade;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public String getTitulo() {
        return titulo;
    }
}