package Aula02;

public class questao01 {

    public static void main(String[] args) {

        // Max e minimo de Byte
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;

        // overFlow e underflow
        byte overflowByte = (byte) (maxByte + 1);
        byte underflowByte = (byte) (minByte - 1);

        System.out.println("Byte máximo: " + maxByte);
        System.out.println("Byte mínimo: " + minByte);
        System.out.println("Overflow Byte: " + overflowByte);
        System.out.println("Underflow Byte: " + underflowByte);

        // Max e minimo de Short
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;

        //underflow e overflow
        short overflowShort = (short) (maxShort + 1);
        short underflowShort = (short) (minShort - 1);

        System.out.println("Short máximo: " + maxShort);
        System.out.println("Short mínimo: " + minShort);
        System.out.println("Overflow Short: " + overflowShort);
        System.out.println("Underflow Short: " + underflowShort);

        // Max e minino de Int
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        //overflow e underflow
        int overflowInt = maxInt + 1;
        int underflowInt = minInt - 1;

        System.out.println("Int máximo: " + maxInt);
        System.out.println("Int mínimo: " + minInt);
        System.out.println("Overflow Int: " + overflowInt);
        System.out.println("Underflow Int: " + underflowInt);

        //300 long em Byte
        long numLong = 300L;
        byte longEmByte = (byte) numLong;

        System.out.println("300 Long em byte é: " + longEmByte);
        //300 long não cabe em byte.
        //O Java descarta os bits extras ao converter.
        //Resultado: 44.
    }
}