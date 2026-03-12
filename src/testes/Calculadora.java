package testes;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double v1, v2, resultado;
        int soma;
        System.out.println("Digite o primeiro valor: ");
        v1 = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        v2 = sc.nextDouble();
        System.out.println("Digite o operador: ");
        System.out.println("1-Soma");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        soma = sc.nextInt();
        switch (soma) {
            case 1:
                resultado = v1+v2;
                System.out.println(resultado);
                break;
            case 2:
                resultado = v1-v2;
                System.out.println(resultado);
                break;
            case 3:
                resultado = v1*v2;
                System.out.println(resultado);
                break;
            case 4:
                resultado = v1/v2;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
