package Aula13;

import java.util.Scanner;

public class Main {
    static void main() throws ValidacaoException{
        GerenciadorDeUsuarios g = new GerenciadorDeUsuarios();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        try{
            g.cadastrar(null, null);
        } catch (ValidacaotextualException | ValidacaoDataException e){
          //e.printStackTrace();
            System.out.println("Tipo de tratamento para erro");
          throw new IllegalArgumentException();
        } finally {
            System.out.println("Finally executado");
        }
        if (sc != null){
            sc.close();
        }
    }
}
