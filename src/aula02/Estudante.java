public class Estudante {
    public Estudante(String aluno, String matricula, double...notas) {
        this.aluno = aluno;
        this.matricula = matricula;
        this.notas = notas;
    }
    String aluno;
    String matricula;
    double[] notas;
    public String setAluno(){
        return aluno;
    }
    public String setMatricula() {
        return matricula;
    }
    public void setNotas(double...notas) {
        this.notas = notas;
    }
    public double[] getNotas() {
        return notas;
    }
    public double getNota(int pos) {
        if (pos < 0 || pos >= notas.length){
            return -1;
        }
        return notas[pos];

    }
    public double getMedia () {

        double soma = 0;
        for (double n: notas) {
            soma += n;
        }

        return soma / notas.length;
    }

    public String getSituacao () {
        double media = getMedia();
        if (media >= 70) {
            return ("Aprovado");
        }
        if (media >= 50 && media < 70) {
            return ("Recuperação");
        } else {
            return ("Aluno reprovado");
        }
    }
}
public void main(String[] args){
    Estudante aluno = new Estudante("Matheus Kevyn Gouveia de Lima", "156-454-787-08", 70, 80, 90);
    System.out.println("Aluno: " + aluno.aluno);
    System.out.println("Matricula: " + aluno.matricula);
    System.out.println(aluno.getNota(2));
    System.out.println("Média: " + aluno.getMedia());
    System.out.println("Situação: " + aluno.getSituacao());
}