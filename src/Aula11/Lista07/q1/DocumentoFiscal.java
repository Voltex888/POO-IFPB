package Aula11.Lista07.q1;

public abstract class DocumentoFiscal {
    protected double valor;
    protected String indentificador;

    public DocumentoFiscal(double valor, String indentificador) {
        this.valor = valor;
        this.indentificador = indentificador;
    }
    public abstract double calcularImposto();

    public abstract String gerarXML();
}
