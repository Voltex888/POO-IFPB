package Aula11.Lista07.q2;

import java.util.List;

public interface Armazenamento {
    void gravar(String caminho, byte[] dados);

    byte[] ler(String caminho);

    void realizarBackup(Armazenamento origem, Armazenamento destino, List<String> caminhos);
}
