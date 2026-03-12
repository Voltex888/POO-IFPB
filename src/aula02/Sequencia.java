package aula02;

public class Sequencia {
    int[] numeros;
    public Sequencia(String nome, int... sequencia) {

        this.numeros = sequencia;
    }
    public void imprimirSequencia() {
        for (int i = 0; i <numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
