package Aula10.Questao02;

public class Arqueiro extends Personagem{
    private int danoFlecha, flechasRestantes;
    public Arqueiro(String nome, int pontosDeVida, int danoFlecha, int flechasRestantes) {
        super(nome, pontosDeVida);
        setDanoFlecha(danoFlecha);
        setFlechasRestantes(flechasRestantes);
    }

    public int getDanoFlecha() {
        return danoFlecha;
    }

    public void setDanoFlecha(int danoFlecha) {
        if  (danoFlecha < 0) throw new IllegalArgumentException();
        this.danoFlecha = danoFlecha;
    }

    public int getFlechasRestantes() {
        return flechasRestantes;
    }

    public void setFlechasRestantes(int flechasRestantes) {
        if (flechasRestantes < 0) throw new IllegalArgumentException();
        this.flechasRestantes = flechasRestantes;
    }

    @Override
    public void executarAtaque(Personagem alvo) {
        if (flechasRestantes > 0 && alvo.estaVivo()){
            alvo.receberDano(danoFlecha);
            flechasRestantes -= 1;
        }
    }

    @Override
    public String getClasse() {
        return "Arqueiro";
    }
}
