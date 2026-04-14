package Aula09.Oficina;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Agendamento {
    public static double custoHora = 150;
    Cliente cliente;
    List<Servico> servicos;
    Veiculo veiculo;

    public enum TipoAgendamento{
        Urgente, Normal
    }

    public Agendamento(Cliente cliente, Veiculo veiculo) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.servicos = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Servico> getServicos() {
        return Collections.unmodifiableList(servicos);
    }

    public void addServico(Servico servico) {
        servicos.add(servico);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    // Template method — não deve ser sobreposto
    protected final double calcularCustoTotal() {
        double base = custoTotal(); // passo variável
        double desconto = calcularDesconto(); // passo variável
        return base - desconto;
    }
        public abstract double custoTotal();
        public abstract double calcularDesconto();

    /*private String verificarTipo(){
        return getClass().getSimpleName();
    } */
    @Override
    public String toString() {
        return "Agendamento{" +
                "\n\tcliente= " + cliente +
                "\n\tserviços= " + servicos.size() +
                "\n\tveículo= " + veiculo +
                "\n}";
    }
}
