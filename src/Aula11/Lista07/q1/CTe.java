package Aula11.Lista07.q1;

public class CTe implements DocumentoFiscal{
    double valor;
    String indentificador;
    public CTe(double valor, String indentificador) {
    }

    @Override
    public double calcularImposto(double valor) {
        return valor * 0.12;
    }

    @Override
    public String gerarXML() {
        return "<cte>" + indentificador + "</cte>";
    }

    @Override
    public String getIndentificador() {
        return indentificador;
    }
}
