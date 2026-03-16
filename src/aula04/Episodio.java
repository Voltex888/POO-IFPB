package aula04;

public class Episodio {

    private String titulo;
    private int numero;
    private int duracaoMinutos;
    private String status = "RASCUNHO";

    public Episodio (String titulo, int numero, int duracaoMinutos){
        if (titulo == null || titulo.isBlank()) throw new IllegalArgumentException();

        if (numero <=0) throw new IllegalArgumentException();

        if (duracaoMinutos <=0) throw new IllegalArgumentException();

        this.titulo = titulo;
        this.numero = numero;
        this.duracaoMinutos = duracaoMinutos;
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

    public void setDuracaoMinutos(int minutos) {
        if (minutos <=0) throw new IllegalArgumentException();
        this.duracaoMinutos = minutos;
    }

    public void publicar() {
        if (status == "RASCUNHO"){
            this.status = "PUBLICADO";
        }
    }

    public void arquivar() {
        if (status == "PUBLICADO") {
            this.status = "ARQUIVADO";
        }
    }
    public void restaurar() {
        if (status == "ARQUIVADO"){
            this.status = "RASCUNHO";
        }
    }
}
