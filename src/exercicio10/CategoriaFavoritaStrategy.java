package exercicio10;

import java.util.List;
import java.util.Map;

public class CategoriaFavoritaStrategy implements RecomendacaoStrategy {

    private Map<String, String> categoriaFavorita;

    public CategoriaFavoritaStrategy(Map<String, String> categoriaFavorita) {
        this.categoriaFavorita = categoriaFavorita;
    }

    @Override
    public List<Produto> recomendar(String nomeCliente, List<Produto> catalogo) {
        String favorita = categoriaFavorita.getOrDefault(nomeCliente, "");

        return catalogo.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(favorita))
                .limit(3)
                .toList();
    }
}
