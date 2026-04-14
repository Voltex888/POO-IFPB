package Aula08;

public class AgendamentoUrgente extends Agendamento {
    private double taxaUrgencia;
    public AgendamentoUrgente(Cliente cliente, Veiculo veiculo,
                              double taxaUrgencia) {
        super(cliente, veiculo);
        this.taxaUrgencia = taxaUrgencia;
    }

    @Override
    public double custoTotal() {
        return super.custoTotal() + taxaUrgencia;
    }

    @Override
    public String toString() {
        return "AgendamentoUrgente{" +
                super.toString() +
                "\n\ttaxaUrgencia=" + taxaUrgencia +
                "\n\t Custo total=" + custoTotal() +
                "\n\t}";
    }
}