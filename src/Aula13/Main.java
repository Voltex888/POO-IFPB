package Aula13;

public class Main {
    static void main() throws ValidacaoException{
        GerenciadorDeUsuarios g = new GerenciadorDeUsuarios();
        try{
            g.cadastrar(null, null);
        } catch (ValidacaoException e){
          e.printStackTrace();
        }
    }
}
