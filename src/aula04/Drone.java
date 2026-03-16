package aula04;

public class Drone {
    private String identificador;
    private int bateria;
    private int altitude;
    private boolean emVoo;

    public Drone(String identificador) {
        if (identificador == null || identificador.isBlank())
            throw new IllegalArgumentException();

        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getBateria() {
        return bateria;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public void setBateria(int valor) {
        if (valor > 100 || valor < 0)
            throw new IllegalArgumentException();

        this.bateria = valor;
    }

    public void decolar() {
        if (bateria > 20) {
            emVoo = true;
        }
    }

    public void setAltitude(int valor) {
        if (!isEmVoo()) return;

        if (valor > 120 || valor < 0) throw new IllegalArgumentException();

        altitude = valor;
    }

    public void pousar() {
        emVoo = false;
        altitude = 0;
    }
}
