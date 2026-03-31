package Aula07.Conteudo;

public class Midia {
    private String tipo;
    private int duracaoSegundos;
    private String resolucao;

    public Midia(String tipo, int duracaoSegundos, String resolucao) {
        this.tipo = tipo;
        this.duracaoSegundos = duracaoSegundos;
        this.resolucao = resolucao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String descricao() {
        if (tipo.equalsIgnoreCase("video")) {
            return "Vídeo " + resolucao + " | " + duracaoSegundos + "s";
        }

        if (tipo.equalsIgnoreCase("imagem")) {
            return "Imagem " + resolucao;
        }

        if (tipo.equalsIgnoreCase("audio")) {
            return "Áudio | " + duracaoSegundos + "s";
        }

        return "Mídia desconhecida";
    }
}
