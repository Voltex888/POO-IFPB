package Aula11.Lista07.q1;

public class ProcessadorFiscal {

    public String processar(DocumentoFiscal doc, double valor) {
        double imposto = doc.calcularImposto(valor);

        String xml = doc.gerarXML();
        return xml + "|imposto:" + String.format("%.2f", imposto);
    }
}