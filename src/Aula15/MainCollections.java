package Aula15;

import java.util.*;

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

        Map<String, String> contatos = new HashMap<>();

        contatos.put("Mateus", "99999-9999");
        contatos.put("Ana", "98888-8888");

        System.out.println("\nMAP");
        System.out.println(contatos);

        Queue<Integer> fila = new LinkedList<>();
    }
}
