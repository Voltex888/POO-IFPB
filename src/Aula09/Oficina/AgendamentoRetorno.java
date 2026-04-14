package Aula09.Oficina;

public class AgendamentoRetorno extends Agendamento {
    private double taxa = 0.15;

    public AgendamentoRetorno(Cliente cliente, Veiculo veiculo) {
        super(cliente, veiculo);
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
        return custoTotal() - (custoTotal() * taxa);
    }

    @Override
    public String toString() {
        return "AgendamentoUrgente{" +
                super.toString() +
                "\n\ttaxa: " + taxa * 100 + "%" +
                "\n\t, Custo total=" + calcularCustoTotal() +
                "\n\t}";
    }
}
