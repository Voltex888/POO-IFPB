package Aula07.Treinamento;

public class Usuario {
    private String nome;
    private double pesoKg, alturaM;
    private int idade;
    private String sexo;

    public Usuario(String nome, double pesoKg, double alturaM, int idade, String sexo) {
        this.nome = nome;
        this.pesoKg = pesoKg;
        this.alturaM = alturaM;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double getAlturaM() {
        return alturaM;
    }

    public void setAlturaM(double alturaM) {
        this.alturaM = alturaM;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double calcularIMC() {
        return pesoKg / (alturaM * alturaM);
    }

    public String resumo() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", pesoKg=" + pesoKg +
                ", alturaM=" + alturaM +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
