package Aula11.q1;

public class PagamentoCartao extends Pagamento{
    @Override
    public void processarPagamento() {
        System.out.println("Cobrando cartão...");
    }
}
