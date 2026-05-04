package Aula11.Lista07.q1;

public class NFe implements DocumentoFiscal{
    double valor;
    String indentificador;
    public NFe(double valor, String indentificador) {
        this.valor = valor;
        this.indentificador = indentificador;
    }

    @Override
    public double calcularImposto(double valor) {
        return valor * 0.18;
    }

    @Override
    public String gerarXML() {
        return "<nfe>" + indentificador + "</nfe>";
    }

    @Override
    public String getIndentificador() {
        return indentificador;
    }
}
