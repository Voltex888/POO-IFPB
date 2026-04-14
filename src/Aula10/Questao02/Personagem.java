package Aula10.Questao02;

public abstract class Personagem {
    private String nome;
    private int pontosDeVida;

    public Personagem(String nome, int pontosDeVida) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
    }

    public String getNome() {
        return nome;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }
    public boolean estaVivo(){
        return pontosDeVida > 0;
    }
    public void receberDano(int dano){
        if (estaVivo()){
            pontosDeVida -= dano;
        }
        if (!estaVivo()){
            pontosDeVida =0;
        }
    }
    public abstract void executarAtaque(Personagem alvo);
    public abstract String getClasse();
}
