package Aula07;

import java.util.ArrayList;
import java.util.List;

public class Formula {
    private String nome;
    List<ItemFormula> ingredientes;

    class ItemFormula {
        Ingrediente ingrediente;
        double quantidade;
        String observacao;

        public double getQuantidade() {
            return quantidade;
        }

        public ItemFormula(Ingrediente ingrediente, double quantidade, String observacao) {
            this.ingrediente = ingrediente;
            this.quantidade = quantidade;
            this.observacao = observacao;
        }
    }

    public Formula(String nome) {
        setNome(nome);
        ingredientes = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) throw new IllegalArgumentException();
        this.nome = nome;
    }

    public void adicionarIngrediente(Ingrediente ing, double quantidade) {
        ingredientes.add(new ItemFormula(ing, quantidade, ""));
    }

    public void adicionarIngrediente(Ingrediente ing, double quantidade, String observacao) {
        ingredientes.add(new ItemFormula(ing, quantidade, observacao));
    }

    public double calcularCusto() {
        double total = 0;
        for (ItemFormula s : ingredientes) {
            total += s.getQuantidade() * s.ingrediente.getCustoUnitario();
        }
        return total;
    }

    public double calcularCusto(double margemLucro) {
        double custo = calcularCusto();
        return custo + (custo * margemLucro);
    }

    public double calcularCusto(double margemLucro, double desconto) {
        double custoComMargem = calcularCusto(margemLucro);
        return custoComMargem - desconto;
    }

    public String gerarReceituario() {
        String texto = "Fórmula: " + nome + "\n";

        for (ItemFormula ingredientes : ingredientes) {
            texto += "- " + ingredientes.ingrediente.getNome();
            texto += " | " + ingredientes.quantidade + " " + ingredientes.ingrediente.getUnidade();

            if (ingredientes.observacao != null && !ingredientes.observacao.isEmpty()) {
                texto += " | Obs: " + ingredientes.observacao;
            }

            texto += "\n";
        }

        return texto;
    }
}