package Aula11.Lista07.q1;

public class ProcessadorFiscal {

    public String processar(DocumentoFiscal doc) {
        double imposto = doc.calcularImposto();

        String xml = doc.gerarXML();
        return xml + "|imposto:" + String.format("%.2f", imposto);
    }
}