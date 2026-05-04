package Aula11.Lista07.q1;

public class NFSe implements DocumentoFiscal{
    double valor;
    String indentificador;
    public NFSe(double valor, String indentificador) {
        this.valor = valor;
        this.indentificador = indentificador;
    }

    @Override
    public double calcularImposto(double valor) {
        return valor * 0.05;
    }

    @Override
    public String gerarXML() {
        return "<nfse>" + indentificador + "</nfse>";
    }

    @Override
    public String getIndentificador() {
        return indentificador;
    }
}
