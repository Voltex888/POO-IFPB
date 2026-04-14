package Aula09.formas;

public class Quadrado extends Forma{
    public Quadrado(double lado) {
        this.lado = lado;
    }

    private double lado;
    @Override
    protected double getPerimetro() {
        return lado * 4;
    }

    @Override
    protected double getArea() {
        return lado * lado;
    }

}
