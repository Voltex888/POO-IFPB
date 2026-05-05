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
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(caminhoEntrada));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoSaida));

                String linha;
                boolean primeiraLinha = true;

                while ((linha = leitor.readLine()) != null) {
                    if (primeiraLinha) {
                        primeiraLinha = false;
                        continue;
                    }
                    String resultado = processarLinha(linha);
                    if (resultado != null) {
                        escritor.write(resultado);
                        escritor.newLine();
                    }
                }
                System.out.println("[Versão B] Relatório gerado com sucesso: " + caminhoSaida);
            } catch(FileNotFoundException e){
                System.err.println("[Versão B] Arquivo de entrada não encontrado: " + caminhoEntrada);
                System.err.println("         Verifique o caminho e tente novamente.");
            } catch(IOException e){
                System.err.println("[Versão B] Erro durante leitura/escrita: " + e.getMessage());
            }
        }
        private static String processarLinha (String linha){
            String[] partes = linha.split(";");
            if (partes.length < 4) return null;

            String nome = partes[0].trim();
            try {
                double nota1 = Double.parseDouble(partes[1].trim());
                double nota2 = Double.parseDouble(partes[2].trim());
                double nota3 = Double.parseDouble(partes[3].trim());
                double media = (nota1 + nota2 + nota3) / 3;
                return String.format("%s - Média: %.2f", nome, media);
            } catch (NumberFormatException e) {
                System.err.println("Aviso: nota inválida na linha \"" + linha + "\". linha ignorada");
                return null;
            }
        }
    }
