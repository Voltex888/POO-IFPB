package Aula13;

import java.time.LocalDateTime;

public class GerenciadorDeUsuarios {
    public void cadastrar(String nome, LocalDateTime dataNascimento) throws ValidacaotextualException, ValidacaoDataException{
        Usuario.validar(nome, dataNascimento);
    }
}
