package exercicio10;

import java.util.List;

public class ProdutosSimilaresStrategy implements RecomendacaoStrategy {
    private Produto produtoReferencia;

    public ProdutosSimilaresStrategy(Produto produtoReferencia) {
        this.produtoReferencia = produtoReferencia;
    }

    @Override
    public List<Produto> recomendar(String nomeCliente, List<Produto> catalogo) {
        return catalogo.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(produtoReferencia.getCategoria()))
                .filter(p -> !p.getNome().equals(produtoReferencia.getNome()))
                .limit(3)
                .toList();
    }
}
