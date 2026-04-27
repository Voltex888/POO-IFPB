package Aula11.q1;

import java.util.ArrayList;
import java.util.List;

public class Processo {

    List<Pagamento> pagamentos;

    public Processo(List<Pagamento> pagamentos){
        this.pagamentos = pagamentos;
    }

    public void processarPagamentos() {

        for(Pagamento p : pagamentos){
            p.processarPagamento();
        }

    }
}