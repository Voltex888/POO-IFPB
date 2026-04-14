package Aula10.Questao03;

public class Ebook extends Produto{
    private String formatoArquivo;
    public Ebook(String titulo, String autor, double preco, String formatoArquivo) {
        super(titulo, autor, preco);
        this.formatoArquivo = formatoArquivo;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    @Override
    public String toString() {
        return "Ebook{" +
                super.toString() +
                "\n\tformato de Arquivo: '" + formatoArquivo +
                '}';
    }
}
