package Aula15;

import java.util.*;
/*
========================================
JAVA COLLECTIONS
========================================

List
- Coleção ordenada
- Permite valores duplicados
- Melhor quando:
  -> Você precisa de índices
  -> Você quer elementos repetidos
  -> Você precisa manter ordem

Principais implementações:
- ArrayList
  -> Mais rápido para buscas
  -> Melhor na maioria dos casos

- LinkedList
  -> Melhor para inserções e remoções
  -> Boa para filas

========================================
Set
========================================

Set
- NÃO permite duplicados
- Não possui índice

Principais implementações:
- HashSet
  -> Mais rápido
  -> Não mantém ordem

- LinkedHashSet
  -> Mantém ordem de inserção

- TreeSet
  -> Mantém ordenado automaticamente

Melhor quando:
-> Você quer valores únicos
-> Quer remover duplicados automaticamente

========================================
Map
========================================

Map
- Estrutura chave + valor
- Chaves não podem repetir

Principais implementações:
- HashMap
  -> Mais rápido
  -> Não mantém ordem

- LinkedHashMap
  -> Mantém ordem de inserção

- TreeMap
  -> Mantém ordenado pela chave

Melhor quando:
-> Busca por identificador
-> CPF, ID, email, usuário etc

========================================
Queue
========================================

Queue
- FIFO (First In First Out)
- Primeiro que entra é o primeiro que sai

Melhor quando:
-> Fila de atendimento
-> Sistema de senhas
-> Processamento de tarefas

Métodos comuns:
- add()
- poll()
- peek()

========================================
Stack
========================================

Stack
- LIFO (Last In First Out)
- Último que entra é o primeiro que sai

Melhor quando:
-> Sistema de desfazer
-> Histórico do navegador
-> Backtracking

Métodos comuns:
- push()
- pop()
- peek()

========================================
ANOTAÇÕES DE COMPLEXIDADE
========================================

ArrayList
- get() muito rápido
- Inserção no meio é lenta

LinkedList
- Inserção e remoção rápidas
- Acesso mais lento

HashMap / HashSet
- Busca muito rápida
- Complexidade média O(1)

TreeMap / TreeSet
- Ordenação automática
- Complexidade O(log n)

========================================
BOAS PRÁTICAS
========================================

- Prefira interfaces:
  List<String> nomes = new ArrayList<>();

- Use generics
- Sobrescreva toString()
- Use streams para filtros
- Use Comparator para ordenação personalizada

========================================
EXEMPLOS
========================================
*/

public class MainCollections {
    static void main(String[] args) {
         /*
        ========================================
        ARRAYLIST
        ========================================
        Melhor para:
        -> Listas dinâmicas
        -> Muitas leituras
        */

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Matheus", 20, 9.5));
        alunos.add(new Aluno("Walmir", 19, 10));
        alunos.add(new Aluno("Arthur", 24, 9.75));

        System.out.println("LISTA DE ALUNOS");
        for (Aluno a : alunos) {
            System.out.println(a.toString());

        }

        /*
        ========================================
        HASHSET
        ========================================
        Melhor para:
        -> Valores únicos
        -> Remover duplicados
        */


        Set<String> linguagens = new HashSet<>();

        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Java");

        System.out.println("\nSET");
        System.out.println(linguagens);

        /*
        ========================================
        HASHMAP
        ========================================
        Melhor para:
        -> Busca rápida por chave
        -> Cadastros
        */

        Map<String, String> contatos = new HashMap<>();

        contatos.put("Mateus", "99999-9999");
        contatos.put("Ana", "98888-8888");

        System.out.println("\nMAP");
        System.out.println(contatos);

        /*
        ========================================
        QUEUE
        ========================================
        Estrutura FIFO
        */

        Queue<Integer> fila = new LinkedList<>();

        fila.add(10);
        fila.add(20);
        fila.add(30);

        System.out.println("\nFILA");
        System.out.println(fila.poll());
        System.out.println(fila);

          /*
        ========================================
        STACK
        ========================================
        Estrutura LIFO
        */

        Stack<String> historico = new Stack<>();

        historico.push("Página 1");
        historico.push("Página 2");

        System.out.println("\nStack:");
        System.out.println(historico.pop());
    }
}
