package Aula04;

public class ItemLaboratorio {
    String codigo;
    String nome;
    int qtdDisponivel;
    int qtdMinima;
    private String status;
    public ItemLaboratorio(String codigo, String nome, int qtdDisponivel, int qtdMinima){

        if (codigo == null || codigo.isBlank()) throw new IllegalArgumentException();

        if (nome == null || nome.isBlank()) throw new IllegalArgumentException();

        if (qtdDisponivel <0) throw new IllegalArgumentException();

        if (qtdMinima <=0) throw new IllegalArgumentException();

        this.codigo = codigo;
        this.nome = nome;
        this.qtdDisponivel = qtdDisponivel;
        this.qtdMinima = qtdMinima;


        atualizarStatus();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeDisponivel() {
        return qtdDisponivel;
    }

    public int getQuantidadeMinima() {
        return qtdMinima;
    }

    public String getStatus() {
        return status;
    }

    public void saida(int qtd) {
        if (qtd <=0) throw new IllegalArgumentException();
        if (qtd > qtdDisponivel){
            return;
        }
        qtdDisponivel -= qtd;
        atualizarStatus();
    }
    public void entrada(int qtd) {
        if (qtd <=0) throw new IllegalArgumentException();
        qtdDisponivel += qtd;
        atualizarStatus();
    }

private void atualizarStatus() {
    if (qtdDisponivel == 0) {
        status = "ESGOTADO";
    }
    else if (qtdDisponivel > 0 && qtdDisponivel <= qtdMinima) {
        status = "ALERTA";
    } else {
        status = "NORMAL";
        }
    }
}
