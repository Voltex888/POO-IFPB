package Aula13.Exercicios.Questao01;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Aula13.Exercicios.Questao01.ConversorDeNotas.obterConceito;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("Digite sua nota (0 a 10): ");
            try {
                double n1 = sc.nextDouble();
                String conceito = obterConceito(n1);
                System.out.println("Conceito: " + conceito);
                entradaValida = true;

            } catch (InputMismatchException e) {
                System.out.println("Erro: entrada inválida. Você digitou um valor que não é número.");
                System.out.println("Por favor, use apenas dígitos e vírgula/ponto (ex: 7.5).\n");
                sc.nextLine();

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Por favor, informe uma nota dentro do intervalo permitido.\n");
            }
        }
        sc.close();
    }
}