import java.util.function.Consumer;
public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup = 0.1;

    Supplier<Double> precoComMarkup = () -> preco * (1 + percentualMarkup);
    Consumer<Double> atualizarMarkup = preco -> percentualMarkup = (preco / 100);

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

import java.util.function.Supplier;
