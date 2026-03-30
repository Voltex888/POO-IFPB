package Aula05;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Agendamento {
    private String nome;
    private String servico;
    private LocalDateTime data;
    public Agendamento(){
        this("Nenhum dado foi inserido");
    }
    public Agendamento(String nome){
        this(nome, LocalDateTime.now(), null);
    }
    public Agendamento(String nome, LocalDateTime data, String servico){
        this.nome = nome;
        this.data = data;
        this.servico = servico;
    }

    @Override
    public String toString(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");
        return String.format("Nome: %s, Serviço: %s, Data: %s", nome, servico, df.format(data));
    }

}
