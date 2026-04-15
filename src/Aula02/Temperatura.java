public class Temperatura {

    double valor;
    String escala;

    public Temperatura(String escala, double valor) {

        if (!escala.equals("C") &&
                !escala.equals("F") &&
                !escala.equals("K")) {

            System.out.println("Escala inválida");
            return;
        }

        if (escala.equals("K") && valor < 0) {
            System.out.println("Temperatura em Kelvin não pode ser negativa");
            return;
        }

        this.escala = escala;
        this.valor = valor;
    }

    public Temperatura toCelsius() {

        if (escala.equals("C")) {
            return new Temperatura("C", valor);
        }

        if (escala.equals("F")) {
            double c = (valor - 32) * 5.0 / 9.0;
            return new Temperatura("C", c);
        }

        double c = valor - 273;
        return new Temperatura("C", c);
    }

    public Temperatura toFahrenheit() {

        if (escala.equals("F")) {
            return new Temperatura("F", valor);
        }

        if (escala.equals("C")) {
            double f = valor * 1.8 + 32;
            return new Temperatura("F", f);
        }

        double f = (valor - 273) * 1.8 + 32;
        return new Temperatura("F", f);
    }

    public Temperatura toKelvin() {

        if (escala.equals("K")) {
            return new Temperatura("K", valor);
        }

        if (escala.equals("C")) {
            double k = valor + 273;
            return new Temperatura("K", k);
        }

        double k = (valor - 32) * 5.0 / 9.0 + 273;
        return new Temperatura("K", k);
    }

    public void imprimeComEscala() {
        System.out.println(valor + " °" + escala);
    }
}
    public void main(String[] args) {

        Temperatura temp = new Temperatura("C", 25);

        Temperatura c = temp.toCelsius();
        Temperatura f = temp.toFahrenheit();
        Temperatura k = temp.toKelvin();

        c.imprimeComEscala();
        f.imprimeComEscala();
        k.imprimeComEscala();
    }