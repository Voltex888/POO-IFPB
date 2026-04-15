package Aula10.Questao04;

import java.util.ArrayList;
import java.util.List;

public class PlataformaLearnHub {
    private List<Avaliavel> avaliaveis = new ArrayList<>();

    public void cadastrar(Avaliavel avaliavel) {
        avaliaveis.add(avaliavel);
    }

    public List<Compravel> listarCompravel() {
        List<Compravel> lista = new ArrayList<>();
        for(Avaliavel a : avaliaveis){
            if(a instanceof Compravel b){
                lista.add(b);
            }
        }
        return lista;
    }

    public List<Avaliavel> listarPorNotaMinima(double notaMinima) {
        List<Avaliavel> listaNotasMinimas = new ArrayList<>();

        for (Avaliavel a : avaliaveis) {
            if (a.getNotaMedia() >= notaMinima) {
                listaNotasMinimas.add(a);
            }
        }
        return listaNotasMinimas;
    }

    public String gerarPaginaDeBusca(double notaMinina) {
        StringBuilder res = new StringBuilder();
        for (Avaliavel a : listarPorNotaMinima(notaMinina)) {
                res.append(a.gerarResumoPublico() + "\n");
            }
        return res.toString();
    }

    public String processarCompra(String nomeComprador, String tituloCurso) {
        for (Avaliavel avaliavel : avaliaveis){
            if(avaliavel instanceof Curso b){
                Curso curso = b;

                if(curso.getTitulo().equals(tituloCurso) && curso instanceof Compravel c){
                    return c.gerarRecibo(nomeComprador);
                }
            }
        }
        return null;
    }
    public List<String> gerarRecibosEmLote(String nomeComprador){
        List<String> recibos = new ArrayList<>();
        for (Compravel c : listarCompravel()){
            recibos.add(c.gerarRecibo(nomeComprador) + "\n");
        }
        return recibos;
    }
}