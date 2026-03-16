package aula04;

import java.util.List;

public class Receita {
    public String nome;
    public int tempoPreparo;
    public int redimentosPorcoes;
    public List<String> Ingredientes;

    public Receita(String nome, int TempoPreparo, int rendimentosPorcoes) {
        if (nome == null || nome.isEmpty() || tempoPreparo <= 0 || rendimentosPorcoes <=0){
            throw new IllegalArgumentException();

        }
        else {
            this.nome = nome;
            this.tempoPreparo = TempoPreparo;
            this.redimentosPorcoes = rendimentosPorcoes;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTempoPreparo(int TempoPreparo) {
        if (tempoPreparo <= 0){
            throw new IllegalArgumentException("Seu valor é inválido");
        }
        else {
            this.tempoPreparo = TempoPreparo;
        }
    }
    public int getTempoPreparo(){
        return tempoPreparo;
    }
    public int getRendimentoPorcoes(){
        return redimentosPorcoes;
    }
    public void setRendimentoPorcoes(int redimentosPorcoes){
        if (redimentosPorcoes <= 0){
            throw new IllegalArgumentException("Seu valor é inválido");
        }
        else {
            this.redimentosPorcoes = redimentosPorcoes;
        }
    }
    public List<String> getIngredientes(){
        return Ingredientes;
    }

    public void adicionarIngrediente(String ingredientes){
        if (ingredientes != null || !ingredientes.isEmpty()){
            this.Ingredientes.add(ingredientes);
        }
    }
    public void removerIngrediente(String ingrediente){
        for (String verificar : Ingredientes){
            if (verificar.equals(ingrediente)){
                Ingredientes.remove(ingrediente);
            }
        }
    }
}
