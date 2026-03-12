public class Relogio {
    int horas;
    int minutos;
    int segundos;
    public Relogio(int horas, int minutos, int segundos ){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public void tick(){
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
        if (minutos == 60) {
            minutos = 0;
            horas++;
        }
        if (horas == 24){
            horas = 0;
        }
    }
    public void avancarSegundos(int segundos){
        for (int i = 0; i < segundos; i++){
            tick();
        }
    }
    public String exibirDados() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
    public boolean isMaiorQue(Relogio outro){
        int relogio1 = this.horas * 3600 + this.minutos * 60 + this.segundos;
        int relogio2 = outro.horas * 3600 + outro.minutos * 60 + outro.segundos;
        return relogio1 > relogio2;
        }
    }

public void main(String[] args){
        Relogio r1 = new Relogio(01, 01, 02);
        Relogio r2 = new Relogio(23,59,57);
        System.out.println(r1.exibirDados());
        r1.avancarSegundos(5);
        r2.avancarSegundos(1);
        System.out.println(r1.exibirDados());
        System.out.println(r2.exibirDados());
        System.out.println(r1.isMaiorQue(r2));
    }

