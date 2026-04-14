package Aula10.Questao01;

public class VeiculoCNPJ extends Veiculo{
    private String cnpj;
    public VeiculoCNPJ(String placa, String anoFabricacao, String categoria, String CNPJ) {
        super(placa, anoFabricacao, categoria);
        this.cnpj = CNPJ;
    }

    @Override
    String categoria() {
        return categoria;
    }
    protected String descricao(){
    return "Cliente - CNPJ: " + cnpj + super.descricao();
    }
}
