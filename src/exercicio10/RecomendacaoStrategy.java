package exercicio10;

import java.util.List;

public interface RecomendacaoStrategy {
    List<Produto> recomendar(String nomeCliente, List<Produto> catalogo);
}