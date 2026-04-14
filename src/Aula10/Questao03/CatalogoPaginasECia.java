package Aula10.Questao03;

import java.util.ArrayList;
import java.util.Collections;

public class CatalogoPaginasECia {

    private List<Produto> produtos = new ArrayList<>();
    private List<String> log = new ArrayList<>();

    public boolean cadastrar(Produto p) {
        if (produtos.contains(p)) {
            return false;
        }
        produtos.add(p);
        log.add("Cadastrado: " + p);
        return true;
    }

    public List<String> getLog() {
        return Collections.unmodifiableList(log);
    }

    public List<Produto> getProdutos() {
        return Collections.unmodifiableList(produtos);
    }
}

