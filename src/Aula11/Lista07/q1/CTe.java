package Aula11.Lista07.q1;

public class CTe extends DocumentoFiscal{
    public CTe(double valor, String indentificador) {
        super(valor, indentificador);
    }

    @Override
    public double calcularImposto() {
        return valor * 0.12;
    }

    @Override
    public String gerarXML() {
        return "<cte>" + indentificador + "</cte>";
    }
}
