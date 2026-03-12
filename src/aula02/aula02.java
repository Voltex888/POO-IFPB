package aula02;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class aula02 {
        public static void main(String[] args) {
            int valor1 = 1;
            valor1 = valor1 + 2;
            valor1 = valor1 * 2;
            System.out.println("O valor é: "+ valor1);
            System.out.println("Olá, mundo!! ");
            int valor2 = 0;
            for (int i = 1; i < 5; i++) {
                valor2 += i;
            }
            System.out.println(valor2);
            char x = '\u771f';
            System.out.println(x);
            int[] numero = {1, 2, 3, 4};
            ArrayList<Integer> numeros2;
            Integer valor3 = 12; //Wrapper class <- primitivo
            Integer valor4 = valor2; //Unboxing
            String teste = "teste";
            System.out.println(teste.charAt(2));
            BigDecimal val = new BigDecimal("4.50");
            float val1 = 0.1f;
            float soma = 0;
            for (int i = 0; i < 100; i++){
                soma +=val1;
            }System.out.println(soma);
            Produto arroz = new Produto(
                    "Arroz",
                    4.57,
                    500,
                    LocalDateTime.of(2027, 12, 5, 12, 0, 0)
            ){
            };
            double num = 9.9;
            int numInt = (int) num;
            System.out.println(numInt);
            char ch = 'y';
            String str = "abc";
            int num2 = (int) ch;
            System.out.println(num2);
            long y = 2_147_483_648L;
            int m = Integer.MAX_VALUE;
            String sstr = "abc";
            int num3 = (int) y;
            System.out.println(num3);
        }
}