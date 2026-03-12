package aula01;

import java.util.Scanner;

public class Lista01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Questão: ");
        int q = sc.nextInt();

        switch (q) {
            case 1 -> questao1();
            case 2 -> questao2();
            case 3 -> questao3();
            case 4 -> questao4();
            case 5 -> questao5();
            case 6 -> questao6();
            case 7 -> questao7();
            case 8 -> questao8();
            case 9 -> questao9();
            case 10 -> questao10();
            case 11 -> questao11();
            case 12 -> questao12();
            case 13 -> questao13();
            case 14 -> questao14();
            case 15 -> questao15();
            case 16 -> questao16();
            default -> System.out.println("Questão inválida");
        }
    }

    // Questões
    // Desenvolva cada questão dentro dos métodos a seguir
    static void questao1() {
        int idade = 18;
        if (idade >=18) {
            System.out.println("É de maior!");
        } else {
            System.out.println("É de menor!");
        }
    }

    static void questao2() {
        int x = 2;
        if (x % 2 == 0) {
        System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }
    }

    static void questao3() {
        int x = 2;
        int y = 3;
        if (x>y) {
            System.out.println("O maior é: "+ x);
        } else if (x==y) {
            System.out.println("São iguais! ");
        } else {
            System.out.println("O maior é: "+ y);
        }
    }

    static void questao4() {
        float x = 19;
        if (x >= 20) {
            System.out.println(x + "° Está quente");
        } else {
            System.out.println(x + "° Está frio");
        }
    }

    static void questao5() {
        double nota = 7;
        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");
        }
    }

    static void questao6() {
        double kwh = 200;
        double total;
        if (kwh <= 100) {
            total = kwh * 0.50;
        } else {
            total = kwh * 0.70;
        } System.out.println("O total: "+ total);
    }

    static void questao7() {
        for (int i = 10; i >= 0; i--){
            System.out.println("Contagem regressiva: "+ i);
        }
    }

    static void questao8() {
        int x = 1;
        int soma = 0;
        while (x <= 100) {
            x += 1;
            if (x % 2 == 0){
                soma += x;
            }
        } System.out.println("A soma dos pares no intervalo entre 1 a 100 é: "+ soma);
    }

    static void questao9() {
        int x = 1;
        for (int i = 1; i <= 10; i++ ) {
            System.out.println(x + " x " + i  + " = " + (x*i));
        }
    }

    static void questao10() {
        int x = 5;
        Boolean primo = true;
        if (x <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= x / 2; i ++) {
                if (x % i ==0){
                    primo = false;
                    break;
                }
            }
        } if (primo) {
            System.out.println("O número " + " é primo!");
        } else {
            System.out.println("O número " + x + " não é primo!");
        }
    }

    static void questao11() {
        String letra = "A";
        String novaLetra = letra.toLowerCase();
        switch (novaLetra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("É vogal!");
                break;
            default:
                System.out.print("É consoante");
        }
    }

    static void questao12() {
        int cont = 0;
        String frase = "Faca de cozinha";
        String novaFrase = frase.toLowerCase();
        for (char letra: novaFrase.toCharArray()) {
            if (letra == 'a') {
                cont +=1;
            }
        } System.out.println("Tem " + cont + " 'a'");
    }

    static void questao13() {
        int [] lista = {0, 1, 2, 3,};
        int x = 3;
        for (int num: lista) {
            if (num == x) {
                System.out.println("O número " + x + " está na array");
                break;
            }
        }
    }

    static void questao14() {
        double [] notas = {10, 10, 10, 10, 10};
        double soma = 0;
        for (double num: notas) {
            soma += num ;
        }
        double media = (soma / notas.length);
        System.out.println("A media é: " + media);
    }

    static void questao15() {
        String [] frutas = {"Maçã", "Banana", "Morango", "Melão", "Uva"};
        for (String fruta: frutas) {
            System.out.println(fruta);
        }
    }

    static void questao16() {
        String [] frutas = {"Maçã", "Banana", "Morango", "Melão", "Uva"};
        for (String fruta: frutas) {
            if (fruta.charAt(0) =='M') {
                System.out.println(fruta);
            }
        }
    }
}


