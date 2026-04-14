package Aula09.Oficina;

public class AgendamentoUrgente extends Agendamento {
    private double taxaUrgencia;
    public AgendamentoUrgente(Cliente cliente, Veiculo veiculo,
                              double taxaUrgencia) {
        super(cliente, veiculo);
        this.taxaUrgencia = taxaUrgencia;
    }

    @Override
    public double custoTotal() {
        double total = 0;
        for (Servico s : servicos){
            total += s.getSubTotal();
        }
        return total;
    }

    @Override
    public double calcularDesconto() {
        return custoTotal() - (custoTotal() * taxaUrgencia);
    }

    @Override
    public String toString() {
        return "AgendamentoUrgente{" +
                super.toString() +
                "\n\ttaxaUrgencia=" + taxaUrgencia +
                "\n\t Custo total=" + calcularCustoTotal() +
                "\n\t}";
    }
}