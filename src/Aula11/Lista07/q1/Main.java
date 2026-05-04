package Aula11.Lista07.q1;

public class Main {
    static void main(String[] args) {

        DocumentoFiscal d1 = new NFe(1000, "123");

        DocumentoFiscal d2 = new MDFe(5000, "777");

        ProcessadorFiscal p = new ProcessadorFiscal();

        System.out.println(p.processar(d1));

        System.out.println(p.processar(d2));

        }
    }