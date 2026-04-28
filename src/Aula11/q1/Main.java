package Aula11.q1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Pagamento> lista = new ArrayList<>();
        lista.add(new PagamentoPix());
        lista.add(new PagamentoBoleto());
        Processo p = new Processo(lista);
        p.processarPagamentos();
    }
}
