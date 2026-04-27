package Aula11.q1;

public class PagamentoPix extends Pagamento{
    @Override
    public void processarPagamento() {
        System.out.println("Enviando PIX...");
    }
}
