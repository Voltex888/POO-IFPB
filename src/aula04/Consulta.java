package aula04;

public class Consulta {
    private int id;
    private String nomePaciente, nomeMedica, dataHora, status, observacos;
    public Consulta(int id, String nomePaciente, String nomeMedica, String dataHora, String status){
        if (nomePaciente == null || nomePaciente.isBlank() || nomeMedica == null || nomeMedica.isBlank()
                || dataHora == null || dataHora.isBlank() || id<=0) throw new IllegalArgumentException();
        this.id = id;
        this.nomePaciente = nomePaciente;
        this.nomeMedica = nomeMedica;
        this.dataHora = dataHora;
        this.status = status;
        String observacos;
    }
}
