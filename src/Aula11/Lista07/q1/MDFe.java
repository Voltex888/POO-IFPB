package Aula11.Lista07.q1;

public class MDFe extends DocumentoFiscal{
    public MDFe(double valor, String indentificador) {
        super(valor, indentificador);
    }

    @Override
    public double calcularImposto() {
        return valor * 0.08;
    }

    @Override
    public String gerarXML() {
        return "<mdfe>" + indentificador + "</mdfe>";
    }
}