package Aula13.Exercicios.Questao02;

import static Aula13.Exercicios.Questao02.GeradorDeRelatorio.gerarRelatorioFinally;
import static Aula13.Exercicios.Questao02.GeradorDeRelatorio.gerarRelatorioTWR;

public class Main {
    static void main(String[] args) {
        String csvValido = "alunos.csv";
        String csvInexistente = "fantasma.csv";

        System.out.println("══════════════ Teste com arquivo válido ══════════════");
        gerarRelatorioFinally(csvValido, "relatorio_A.txt");
        gerarRelatorioTWR(csvValido, "relatorio_B.txt");

        System.out.println("\n══════════════ Teste com arquivo inexistente ══════════");
        gerarRelatorioFinally(csvInexistente, "relatorio_A_erro.txt");
        gerarRelatorioTWR(csvInexistente, "relatorio_B_erro.txt");

    }
}
