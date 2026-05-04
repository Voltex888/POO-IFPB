package Aula11.Lista07.q1;

public class MDFe implements DocumentoFiscal{
    double valor;
    String indentificador;
    public MDFe(double valor, String indentificador) {
        this.valor = valor;
        this.indentificador = indentificador;
    }

    @Override
    public double calcularImposto(double valor) {
        return valor * 0.08;
    }

    @Override
    public String gerarXML() {
        return "<mdfe>" + indentificador + "</mdfe>";
    }

    @Override
    public String getIndentificador() {
        return indentificador;
    }
}
