package Aula10.Questao01;

public class VeiculoCPF extends Veiculo{
    private String cpf;
    public VeiculoCPF(String placa, String anoFabricacao, String categoria, String CPF) {
        super(placa, anoFabricacao, categoria);
        this.cpf = CPF;
    }

    @Override
    String categoria() {
        return categoria;
    }
    @Override
    protected String descricao(){
        return "Cliente - CPF: " + cpf + super.descricao();
    }

}

