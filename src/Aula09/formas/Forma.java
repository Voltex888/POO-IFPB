package Aula09.formas;

public abstract class Forma {
    protected void mostrarForma() {
        System.out.println("Área: " + getArea());
        System.out.println("Perímetro: " + getPerimetro());
    }

    protected abstract double getPerimetro();

    protected abstract double getArea();
}
