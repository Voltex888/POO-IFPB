package Aula09.formas;

public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    protected void mostrarForma() {
        System.out.println("Circunferência: " + getPerimetro());
        System.out.println("Área do Círculo: " + getArea());
    }
    @Override
    protected double getPerimetro() {
        return 2 * raio * 3.14;
    }

    @Override
    protected double getArea() {
        return raio * raio * 3.14;
    }
}
