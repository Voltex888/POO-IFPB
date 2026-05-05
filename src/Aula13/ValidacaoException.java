package Aula13;

public class ValidacaoException extends RuntimeException {

    public ValidacaoException(){
        System.out.println("Ocorreu erro no seu código");
    }

    public ValidacaoException(String message) {
        super(message);
    }
}
