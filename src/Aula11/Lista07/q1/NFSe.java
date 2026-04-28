package Aula11.Lista07.q1;

public class NFSe extends DocumentoFiscal{
    public NFSe(double valor, String indentificador) {
        super(valor, indentificador);
    }

    @Override
    public double calcularImposto() {
        return valor * 0.05;
    }

    @Override
    public String gerarXML() {
        return "<nfse>" + indentificador + "</nfse>";
    }
}
