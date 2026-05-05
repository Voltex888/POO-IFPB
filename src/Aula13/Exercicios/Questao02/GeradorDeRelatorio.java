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

            while((linha= leitor.readLine()) != null){
                if (primeiraLinha){
                    primeiraLinha = false;
                    continue;
                }
                String resultado = processarLinha(linha);
                if (resultado != null){
                    escritor.write(resultado);
                    escritor.newLine();
                }
            }
            System.out.println("[Versão A] Relatório gerado com sucesso: " + caminhoSaida);
        } catch (FileNotFoundException e) {
            System.err.println("[Versão A] Arquivo de entrada não encontrado: " + caminhoEntrada);
            System.err.println("         Verifique o caminho e tente novamente.");
        } catch (IOException e) {
            System.err.println("[Versão A] Erro durante leitura/escrita: " + e.getMessage());
        } finally {
            if (leitor != null){
                try { leitor.close(); }
                catch (IOException e ){
                    System.err.println("[Versão A] Falha ao fechar o escritor: " + e.getMessage());
                }
            }
        }
    }

    static void gerarRelatorioTWR(String caminhoEntrada, String caminhoSaida) {
        try{
            BufferedReader leitor = new BufferedReader(new FileReader(caminhoEntrada));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoSaida));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
