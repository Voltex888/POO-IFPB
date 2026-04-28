package Aula11.Lista07.q2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArmazenamentoNuvem implements Armazenamento {
    private Map<String, byte[]> storage = new HashMap<>();

    public void gravar(String caminho, byte[] dados) {
        storage.put(caminho, dados);
    }

    public byte[] ler(String caminho) {
        return storage.get(caminho);
    }
}
