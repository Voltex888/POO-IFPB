package Aula11.Lista07.q2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArmazenamentoComCache implements Armazenamento {
    private Armazenamento nuvem;
    private Map<String, byte[]> cache = new HashMap<>();

    public ArmazenamentoComCache() {}

    @Override
    public void gravar(String caminho, byte[] dados) {
        cache.put(caminho, dados);
        // não chama super.gravar() — dados ficam apenas no cache
    }

    @Override
    public byte[] ler(String caminho) {
        return cache.getOrDefault(caminho, null);
    }
}
