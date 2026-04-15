package Aula04;

public class Consulta {
    private int id;
    private String nomePaciente, nomeMedica, dataHora, status, observacoes;
    public Consulta(int id, String nomePaciente, String nomeMedica, String dataHora, String status){
        if (nomePaciente == null || nomePaciente.isBlank() || nomeMedica == null || nomeMedica.isBlank()
                || dataHora == null || dataHora.isBlank() || id<=0) throw new IllegalArgumentException();
        this.id = id;
        this.nomePaciente = nomePaciente;
        this.nomeMedica = nomeMedica;
        this.dataHora = dataHora;
        this.status = "AGENDADA";
        this.observacoes = "";
    }

    public int getId() {
        return id;
    }

    public void confirmar() {
        if (status.equals("AGENDADA")){
            status = "CONFIRMADA";
        }
    }

    public void cancelar() {
        if (status.equals("AGENDADA") || status.equals("CONFIRMADA")){
            status = "CANCELADA";
        }
    }

    public void realizar() {
        if (status.equals("CONFIRMADA")){
            status = "REALIZADA";
        }
    }

    public String getStatus() {
        return status;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getObservacoes() {
        return observacoes;
    }
    public String getNomeMedica(){
        return nomeMedica;
    }
}
