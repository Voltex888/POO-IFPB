package Aula11.Lista07.q2;

import java.util.List;

public abstract class Armazenamento {
    protected abstract void gravar(String caminho, byte[] dados);

    protected abstract byte[] ler(String caminho);

    protected abstract void realizarBackup(Armazenamento origem, Armazenamento destino, List<String> caminhos);
}
