package Aula08;

import java.time.LocalDateTime;

public class AgendamentoRetorno extends Agendamento {
    private double taxa = 0.15;

    public AgendamentoRetorno(Cliente cliente, Veiculo veiculo) {
        super(cliente, veiculo);
    }

    @Override
    public double custoTotal() {
        return super.custoTotal() - (taxa * super.custoTotal());
    }

    @Override
    public String toString() {
        return "AgendamentoUrgente{" +
                super.toString() +
                "\n\ttaxa: " + taxa * 100 + "%" +
                "\n\t, Custo total=" + custoTotal() +
                "\n\t}";
    }
}
