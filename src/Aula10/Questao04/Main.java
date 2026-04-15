package Aula10.Questao04;

public class Main {
    static void main(String[] args) {
        PlataformaLearnHub plataforma = new PlataformaLearnHub();
        Curso cursoA     = new Curso("Java OOP", "Prof. Ana", 4.8, 99.90);
        Curso cursoB     = new Curso("Python Básico", "Prof. Carlos", 3.5, 49.90);
        Instrutor instrutor  = new Instrutor("Prof. Ana", "Programação", 4.9);
        TrilhaDeAprendizado trilha     = new TrilhaDeAprendizado("Trilha Backend", 5, 4.6);

        plataforma.cadastrar(cursoA);
        plataforma.cadastrar(cursoB);
        plataforma.cadastrar(instrutor);
        plataforma.cadastrar(trilha);
        System.out.println(cursoB.getNotaMedia());
        System.out.println(plataforma.gerarPaginaDeBusca(4.6));
    }
}
