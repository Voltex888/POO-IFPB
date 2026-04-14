package Aula08;

public class Veiculo {
    private String placa, modelo, classificacao;
    private int ano;

    public Veiculo(String placa, String modelo, int ano, String classificacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.classificacao = classificacao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        if (!classificacao.equals("PESADO") && !classificacao.equals("LEVE")) throw new IllegalArgumentException();
        this.classificacao = classificacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
