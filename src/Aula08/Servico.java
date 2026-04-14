package Aula08;

public class Servico {
    private String nome;
    private double precoBase;
    private int quantidade;

    public Servico(String nome, double precoBase, int quantidade) {
        setNome(nome);
        setPrecoBase(precoBase);
        setQuantidade(quantidade);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int qtd) {
        if (qtd <= 0) throw new IllegalArgumentException();
        this.quantidade = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) throw new IllegalArgumentException();
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public double getSubTotal(){
        return this.precoBase * this.quantidade;
    }
    public void setPrecoBase(double precoBase) {
        if (precoBase <= 0) throw new IllegalArgumentException();
        this.precoBase = precoBase;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "\n\tnomeServico='" + nome + '\'' +
                "\n\t, precoBase=" + precoBase +
                "\n\t}";
    }

    public double getPreco() {
        return precoBase;
    }
}
