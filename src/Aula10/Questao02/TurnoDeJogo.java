package Aula10.Questao02;

import java.util.ArrayList;
import java.util.List;

public class TurnoDeJogo {
    private Guerreiro guerreiro;
    private Mago mago;
    private Arqueiro arqueiro;
    private List<Personagem> personagens;

    public TurnoDeJogo() {
        personagens = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem p) {
        if (p.estaVivo()) {
            personagens.add(p);
        }
    }
    public int contarVivos() {
        int total = 0;
        for (Personagem p : personagens){
            if (p.estaVivo()){
                total++;
            }
        }
        return total;
    }
    public void executarTurno(Personagem alvo){
        for (Personagem p : personagens){
            if (p.estaVivo() && alvo.estaVivo()){
                p.executarAtaque(alvo);
            }
        }
    }
}
