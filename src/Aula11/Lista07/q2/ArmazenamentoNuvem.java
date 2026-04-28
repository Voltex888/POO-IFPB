package Aula11.Lista07.q2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArmazenamentoNuvem extends Armazenamento {
    private Map<String, byte[]> storage = new HashMap<>();

    public void gravar(String caminho, byte[] dados) {
        storage.put(caminho, dados);
    }

    public byte[] ler(String caminho) {
        return storage.get(caminho);
    }

    @Override
    protected void realizarBackup(Armazenamento origem, Armazenamento destino, List<String> caminhos) {
        for (String c : caminhos) {
            byte[] dados = origem.ler(c);
            if (dados != null) {
                destino.gravar(c, dados);
            }
        }
    }
}
