package aula03.br.edu.ifpb.suap;

import aula03.br.edu.ifpb.suap.model.Estudante;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Estudante est1 = new Estudante();

   /* Estudante est1 = new Estudante();
    try {
        est1.setCpf("1234567892");
    } catch (Exception e) {
        e.printStackTrace();
        }
    }
    /*
        Produto p;

        double valor;
        String nome;
        int quantidadeEstoque;

     */
        //input()
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite um nome: ");
        String entrada = sc.nextLine();

        System.out.println("Você digitou: " + entrada + " e " + numero);*/
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
            while (true) {
                System.out.println("Digite seu CPF: ");
                String cpf = sc.nextLine();
                try {
                    est1.setCpf(cpf);
                    break;
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
