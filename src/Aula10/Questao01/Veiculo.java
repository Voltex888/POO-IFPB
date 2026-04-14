package Aula10.Questao01;

public abstract class Veiculo {
    protected String placa, anoFabricacao, categoria;

    public Veiculo(String placa, String anoFabricacao, String categoria) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        verificadorCategoria(categoria);
    }
    abstract String categoria();

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    private void verificadorCategoria(String categoria){
        if (!categoria.equals("leve") && !categoria.equals("pesado") && !categoria.equals("médio")) {
            throw new IllegalArgumentException();
        }
        setCategoria(categoria);
    }


    protected String descricao() {
        return "\nVeiculo:\n" +
                "\tPlaca: " + placa + "\n" +
                "\tAno de Fabricação: " + anoFabricacao + "\n" +
                "\tCategoria: " + categoria + "\n";
    }
}
