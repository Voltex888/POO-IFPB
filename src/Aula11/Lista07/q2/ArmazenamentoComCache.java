package Aula11.Lista07.q2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArmazenamentoComCache extends Armazenamento {
    private Map<String, byte[]> cache = new HashMap<>();

    @Override
    public void gravar(String caminho, byte[] dados) {
        cache.put(caminho, dados);
        // não chama super.gravar() — dados ficam apenas no cache
    }

    @Override
    public byte[] ler(String caminho) {
        return cache.getOrDefault(caminho, null);
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
