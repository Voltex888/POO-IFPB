package Aula13.Exemplos;

import java.time.LocalDateTime;

public class Usuario {
    public static void validar(String nome, LocalDateTime dataNascimento) throws ValidacaotextualException, ValidacaoDataException{
        if (nome == null) throw new ValidacaotextualException("O nome do usuario não pode ser nulo");
        if (dataNascimento == null) throw new ValidacaoDataException("A data não pode ser nula");
    }
}
