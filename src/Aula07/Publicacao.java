package Aula07;

import java.util.Objects;

public class Publicacao {
    private Criador criador;
    private Midia midia;
    private int curtidas, comentarios, compartilhamentos;

    public Publicacao(Criador criador, Midia midia, int curtidas, int comentarios, int compartilhamentos) {
        this.criador = criador;
        this.midia = midia;
        this.curtidas = curtidas;
        this.comentarios = comentarios;
        this.compartilhamentos = compartilhamentos;
    }

    public double taxaEngajamento() {
        return (curtidas + comentarios + compartilhamentos) / (double) criador.getSeguidores() * 100;
    }
    public double taxaEngajamento(int visualizacao) {
        return (curtidas + comentarios + compartilhamentos) / (double) visualizacao * 100;
    }

    public boolean ehViral() {
        return taxaEngajamento() >= 5;
    }
    public String resumo() {
        return criador.perfil() + midia.descricao();
    }

    public String resumo(String idioma) {
        boolean en = idioma.equalsIgnoreCase("en");
        String likes = en ? "Likes" : "Curtidas";
        String comments = en ? "Comments" : "Comentários";
        String shares = en ? "Shares" : "Compartilhamentos";
        String engagement = en ? "Engagement" : "Engajamento";

        return criador.perfil() + "\n" +
                midia.descricao() + "\n" +
                likes + ": " + curtidas + "\n" +
                comments + ": " + comentarios + "\n" +
                shares + ": " + compartilhamentos + "\n" +
                engagement + ": " + String.format("%.3f", taxaEngajamento());
    }
}