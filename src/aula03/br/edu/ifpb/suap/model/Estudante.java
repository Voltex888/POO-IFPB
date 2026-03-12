package aula03.br.edu.ifpb.suap.model;

import java.time.LocalDateTime;
import java.util.List;

public class Estudante {
    String nome;
    String cpf;



    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf.length() != 11)
            throw new Exception("O CPF deve ter 11 digítos.");
        this.cpf = cpf;

    }

}