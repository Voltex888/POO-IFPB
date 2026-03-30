package Aula06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Oficina {
    private List<Agendamento> agendamentos = new ArrayList<>();
    public void adicionar(Agendamento a) {
        agendamentos.add(a);
    }

    public List<Agendamento> getAgendamentos() {
        return Collections.unmodifiableList(agendamentos);
    }
    public double faturamentoTotalDoDia(){
        double valor = 0;
        for (Agendamento a : agendamentos){
            valor += a.custoTotal();
        }
        return valor;
    }
    @Override
    public String toString() {
        return "Oficina{" +
                "agendamentos=" + agendamentos +
                "Faturamento do dia= " + faturamentoTotalDoDia() +
                '}';
    }
}
