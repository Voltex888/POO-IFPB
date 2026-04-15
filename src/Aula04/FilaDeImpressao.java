
package Aula04;

import java.util.ArrayList;
import java.util.List;

public class FilaDeImpressao {
    String nome;
    List<Documento> fila;

    public FilaDeImpressao(String nome) {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException();
        this.nome = nome;
        fila = new ArrayList<>();
    }

    public void adicionar(Documento documento) {
        if (documento == null) throw new IllegalArgumentException();
        if (documento.getPrioridade().equals("URGENTE")) {
            int i = 0;
            while (i < fila.size() && fila.get(i).getPrioridade().equals("URGENTE")) {
                i++;
            }
            fila.add(i, documento);
        } else {
            fila.add(documento);
        }
    }

    public void imprimirProximo() {
        if (fila.isEmpty()) return;

        Documento d = fila.get(0);
        d.iniciarImpressao();
        d.concluir();
        fila.remove(0);
    }
    public int totalPaginasNaFila() {
        int total = 0;
        for (Documento d : fila) {
            total += d.getNumeroPaginas();
        }
        return total;
    }

    public void cancelar(String nome) {
        for (Documento documento : fila) {
            if (documento.getNome().equals(nome) && documento.getStatus().equals("AGUARDANDO")) {
                fila.remove(documento);
                return;
            }
        }
    }
}
