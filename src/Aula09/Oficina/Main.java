package Aula09.Oficina;

public class Main {
    static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "8399998888");
        Cliente cliente2 = new Cliente("Matheus", "8399554466");
        Veiculo veiculo1 = new Veiculo("ABC1234", "Chevrolet Onix", 2023, "LEVE");
        Veiculo veiculo2 = new Veiculo("XYZ2345", "BYD Dolphin", 2024, "LEVE");

        Servico servico1 = new Servico("Troca de óleo", 150.00, 1);
        Servico servico2 = new Servico("Fazer o motor", 2500.00, 1);
        Servico servico3 = new Servico("Alinhamento e balanceamento", 250.00, 1);

        Agendamento agendamento1 = new AgendamentoUrgente(cliente1, veiculo1, 15);
        agendamento1.addServico(servico1);
        Agendamento agendamento2 = new AgendamentoRetorno(cliente2, veiculo2);
        agendamento2.addServico(servico2);
        agendamento2.addServico(servico3);

        Oficina oficina = new Oficina();
        oficina.adicionar(agendamento1);
        oficina.adicionar(agendamento2);
        
        oficina.gerarRelatorio();
    }
}
