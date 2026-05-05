package Aula13.Exemplos;

public class ValidacaoException extends RuntimeException {

    public ValidacaoException(){
        System.out.println("Ocorreu erro no seu código");
    }

    public ValidacaoException(String message) {
        super(message);
    }
}
