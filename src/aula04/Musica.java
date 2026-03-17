package aula04;

public class Musica {
    private String titulo;
    private String artista;
    private int duracaoSegundos;
    private String prioridade;

    public Musica(String titulo, String artista, int duracaoSegundos, String prioridade){
        if (titulo == null || artista == null || titulo.isBlank() || artista.isBlank()) {
            throw new IllegalArgumentException();
        }

        if (duracaoSegundos <= 0) {
            throw new IllegalArgumentException();
        }

        if (!prioridade.equals("NORMAL") && !prioridade.equals("URGENTE")) {
            throw new IllegalArgumentException();
        }

        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
        this.prioridade = prioridade;
    }

    public void setPrioridade(String nome) {
        if (nome == null || nome.isBlank() || nome.isEmpty()) throw new IllegalArgumentException();
        if (!nome.equals("NORMAL") && !nome.equals("URGENTE")) {
            throw new IllegalArgumentException();
        }
        this.prioridade = nome;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public String getTitulo() {
        return titulo;
    }
}