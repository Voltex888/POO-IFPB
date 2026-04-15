package Aula04;

public class Drone {
    private String identificador;
    private int bateria;
    private int altitude;
    private boolean emVoo;

    public Drone(String identificador) {
        if (identificador == null || identificador.isBlank()) throw new IllegalArgumentException();
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
        if (valor > 100 || valor < 0) throw new IllegalArgumentException();
        bateria = valor;
    }

    public void decolar() {
        if (bateria <= 20) {
            return;
        }
        emVoo = true;
    }

    public void setAltitude(int metros) {
        if (metros > 120 || metros <0) throw new IllegalArgumentException();
        if (emVoo == false){
            return;
        }
        altitude = metros;
    }

    public void pousar() {
        emVoo = false;
        altitude = 0;
    }
}
