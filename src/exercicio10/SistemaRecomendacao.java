package exercicio10;

import java.util.List;

public class SistemaRecomendacao {
    private RecomendacaoStrategy strategy;

    public SistemaRecomendacao(RecomendacaoStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RecomendacaoStrategy strategy) {
        this.strategy = strategy;
    }

    public void recomendar(String nomeCliente, List<Produto> catalogo) {
        List<Produto> recomendados = strategy.recomendar(nomeCliente, catalogo);
        System.out.println("Recomendações para " + nomeCliente + ":");
        if (recomendados.isEmpty()) {
            System.out.println("   Nenhuma recomendação encontrada.");
        } else {
            recomendados.forEach(p -> System.out.println("   → " + p));
        }
        System.out.println();
    }
}
