package Aula01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // formata o número decimal com 2 casas após a vírgula;
        // insere nova linha
        System.out.printf("%.2f %n", 1.265);
        // formata o número decimal com 1 casa após a vírgula e
        // exibe o separador de milhar; insere nova linha
        System.out.printf("%,.1f %n", 8765.6594);
        // formata em notação científica o número decimal
        // (double) com 1 casa após a vírgula; insere nova linha
        System.out.printf("%.1e %n", 4738765318393.0);
        // formata o inteiro para ser exibido com separador de milhar (e milhão) no formato
        // do idioma português do Brasil; insere nova linha
        System.out.printf(new Locale("pt", "BR"), "%,d %n", 1234567);
        // formata a string "teste" para ser exibida num espaço de 10 caracteres (preenche
        // o espaço restante à esquerda com caracteres de espaço " ")
        System.out.printf("%10s", "teste");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite sua nota: ");
        float nota = teclado.nextFloat();

        System.out.printf("%s %.2f", nome, nota);
    }
}
