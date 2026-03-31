package Aula07.Farmacia;

public class Ingrediente {
    private  String nome;
    private double custoUnitario;
    private String unidade;

    public Ingrediente(String nome, double custoUnitario, String unidade) {
        setNome(nome);
        setUnidade(unidade);
        setCustoUnitario(custoUnitario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) throw new IllegalArgumentException();
        this.nome = nome;
    }

    public double getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitario(double custoUnitario) {
        if (custoUnitario <= 0) throw new IllegalArgumentException();
        this.custoUnitario = custoUnitario;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        if (!unidade.equals("mg") && !unidade.equals("ml") && !unidade.equals("g")) throw new IllegalArgumentException();
        this.unidade = unidade;
    }
}
