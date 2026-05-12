package Aula15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        Set<String> linguagens = new HashSet<>();

        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Java");

        System.out.println("\nSET");
        System.out.println(linguagens);
    }
}
