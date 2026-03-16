package aula04;

public class Podcast {

    private String titulo;
    private final int numero;
    private int duracaoMinutos;
    private String status;

    public Podcast(String titulo, int numero, int duracaoMinutos) {

        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Título não pode ser nulo ou vazio.");
        }

        if (numero <= 0) {
            throw new IllegalArgumentException("Número deve ser maior que zero.");
        }

        if (duracaoMinutos <= 0) {
            throw new IllegalArgumentException("Duração deve ser maior que zero.");
        }

        this.titulo = titulo;
        this.numero = numero;
        this.duracaoMinutos = duracaoMinutos;
        this.status = "RASCUNHO";
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumero() {
        return numero;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public String getStatus() {
        return status;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        if (duracaoMinutos <= 0) {
            throw new IllegalArgumentException("Duração deve ser maior que zero.");
        }
        this.duracaoMinutos = duracaoMinutos;
    }

    public void publicar() {
        if (status.equals("RASCUNHO")) {
            status = "PUBLICADO";
        }
    }

    public void arquivar() {
        if (status.equals("PUBLICADO")) {
            status = "ARQUIVADO";
        }
    }

    public void restaurar() {
        if (status.equals("ARQUIVADO")) {
            status = "RASCUNHO";
        }
    }
}