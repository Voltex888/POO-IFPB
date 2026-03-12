package aula02;

public class lista02 {
    public static void main(String[] args) {

        // BYTE
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;

        byte overflowByte = (byte) (maxByte + 1);
        byte underflowByte = (byte) (minByte - 1);

        System.out.println("Byte máximo: " + maxByte);
        System.out.println("Byte mínimo: " + minByte);

        //por estourar o limite, ele converte para o o inverso maior ou menor
        System.out.println("Overflow Byte: " + overflowByte);
        System.out.println("Underflow Byte: " + underflowByte);

        // SHORT
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;

        short overflowShort = (short) (maxShort + 1);
        short underflowShort = (short) (minShort - 1);

        System.out.println("Short máximo: " + maxShort);
        System.out.println("Short mínimo: " + minShort);

        //por estourar o limite, ele converte para o o inverso maior ou menor
        System.out.println("Overflow Short: " + overflowShort);
        System.out.println("Underflow Short: " + underflowShort);

        // INT
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        int overflowInt = maxInt + 1;
        int underflowInt = minInt - 1;

        System.out.println("Int máximo: " + maxInt);
        System.out.println("Int mínimo: " + minInt);

        //por estourar o limite, ele converte para o o inverso maior ou menor
        System.out.println("Overflow Int: " + overflowInt);
        System.out.println("Underflow Int: " + underflowInt);

        // LONG
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;

        long overflowLong = maxLong + 1;
        long underflowLong = minLong - 1;

        System.out.println("Long máximo: " + maxLong);
        System.out.println("Long mínimo: " + minLong);

        //por estourar o limite, ele converte para o o inverso maior ou menor
        System.out.println("Overflow Long: " + overflowLong);
        System.out.println("Underflow Long: " + underflowLong);

        long numLong = 300L;
        byte LongEmByte = (byte) numLong;

        System.out.println("300 Long em byte é " + LongEmByte);

        // O valor 300 excede o limite do byte e perde os bits mais significativos, resultando em 44.
    }
        //questão 3


    class Temperatura {

        double valor;
        String escala;
        Temperatura temp = new Temperatura("C", 25);
        public Temperatura(String escala, double valor) {
            this.escala = escala;
            this.valor = valor;
            if (!escala.equals("C") &&
                    !escala.equals("F") &&
                    !escala.equals("K")) {

                System.out.println("Escala inválida");
                return;
            }

            this.valor = valor;
            this.escala = escala;

            if (escala.equals("C")) {

                double toCelsius = valor;
                double toKelvin = valor + 273;
                double toFahrenheit = valor * 1.8 + 32;

                System.out.println("Celsius: " + toCelsius);
                System.out.println("Kelvin: " + toKelvin);
                System.out.println("Fahrenheit: " + toFahrenheit);
            }

            else if (escala.equals("F")) {

                double toCelsius = (valor - 32) * 5.0 / 9.0;
                double toKelvin = toCelsius + 273;

                System.out.println("Celsius: " + toCelsius);
                System.out.println("Kelvin: " + toKelvin);
                System.out.println("Fahrenheit: " + valor);
            }

            else {

                double toCelsius = valor - 273;
                double toFahrenheit = toCelsius * 1.8 + 32;

                System.out.println("Celsius: " + toCelsius);
                System.out.println("Kelvin: " + valor);
                System.out.println("Fahrenheit: " + toFahrenheit);
            }
        }
    }
    class Circulo {
        double raio;
        public Circulo(double raio) {
            this.raio = raio;
        }
        public double calcularArea() {
            return Math.PI * raio * raio;
        }
        public double calcularCircunferencia() {
            return 2 * Math.PI * raio;
        }

        public boolean contemOutro(Circulo outro) {
            return raio > outro.raio;
        }
        public Circulo maior(Circulo outro){
            if (this.raio > outro.raio) {
                return this;
            }
            return outro;
        }
        public void exibirDados() {
            System.out.println("Raio: " + String.format("%.2f", raio));
            System.out.println("Área: " + String.format("%.2f", calcularArea()));
            System.out.println("Circunferência: " + String.format("%.2f", calcularCircunferencia()));
        }
    }
}