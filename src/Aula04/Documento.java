package Aula04;

public class Documento {
    private String nome;
    private int numeroPaginas;
    private String prioridade, status;

    public Documento(String nome, int numeroPaginas, String prioridade) {
        if (nome == null || nome.isEmpty() || numeroPaginas <= 0 || prioridade == null
                || !prioridade.equals("NORMAL") && !prioridade.equals("URGENTE")) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
        this.prioridade = prioridade;
        this.status = "AGUARDANDO";
    }

    public String getStatus() {
        return status;
    }

    public void iniciarImpressao() {
        if (status.equals("AGUARDANDO")) {
            status = "IMPRIMINDO";
        }
    }

    public void concluir() {
        if (status.equals("IMPRIMINDO")) {
            status = "CONCLUIDO";
        }
    }

    public String getPrioridade() {
        return prioridade;
    }

    public String getNome() {
        return nome;
    }
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
}
