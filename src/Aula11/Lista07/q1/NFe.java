package Aula11.Lista07.q1;

public class NFe extends DocumentoFiscal{
    public NFe(double valor, String indentificador) {
        super(valor, indentificador);
    }

    @Override
    public double calcularImposto() {
        return valor * 0.18;
    }

    @Override
    public String gerarXML() {
        return "<nfe>" + indentificador + "</nfe>";
    }
}
