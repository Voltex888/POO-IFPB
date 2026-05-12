package Aula15;

import java.util.ArrayList;
import java.util.List;

public class MainCollections {
    static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Matheus", 20, 9.5));
        alunos.add(new Aluno("Walmir", 19, 10));
        alunos.add(new Aluno("Arthur", 24, 9.75));

        System.out.println("LISTA DE ALUNOS");
        for (Aluno a : alunos) {
            System.out.println(a.toString());
        }
    }
}
