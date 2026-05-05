package Aula13.Exercicios.Questao02;

import java.io.*;

public class GeradorDeRelatorio {
    static void gerarRelatorioFinally(String caminhoEntrada, String caminhoSaida) {
        BufferedReader leitor = null;
        BufferedWriter escritor = null;
        try {
            leitor = new BufferedReader(new FileReader(caminhoEntrada));
            escritor = new BufferedWriter(new FileWriter(caminhoSaida));

            String linha;
            boolean primeiraLinha= true;


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
