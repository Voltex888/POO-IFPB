package Aula07.Conteudo;

public class Criador {
    private String nomeUsuario;
    private int seguidores;
    private boolean verificado;

    public Criador(String nomeUsuario, int seguidores, boolean verificado) {
        this.nomeUsuario = nomeUsuario;
        this.seguidores = seguidores;
        this.verificado = verificado;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public boolean isVerificado() {
        return verificado;
    }

    public void setVerificado(boolean verificado) {
        this.verificado = verificado;
    }

    public String perfil() {
        String selo = verificado ? " ✓" : "";
        return "@" + nomeUsuario + " (" + seguidores + " seguidores)" + selo;
    }
}
