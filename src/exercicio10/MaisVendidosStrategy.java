package exercicio10;

import java.util.Comparator;
import java.util.List;

public class MaisVendidosStrategy implements RecomendacaoStrategy {
    private static final int LIMITE = 3;

    @Override
    public List<Produto> recomendar(String nomeCliente, List<Produto> catalogo) {
        return catalogo.stream()
                .sorted(Comparator.comparingInt(Produto::getVendas).reversed())
                .limit(LIMITE)
                .toList();
    }
}