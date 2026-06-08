package exercicio10;

import java.util.List;
import java.util.Map;

public class HistoricoComprasStrategy implements RecomendacaoStrategy {

    private Map<String, List<String>> historico;

    public HistoricoComprasStrategy(Map<String, List<String>> historico) {
        this.historico = historico;
    }

    @Override
    public List<Produto> recomendar(String nomeCliente, List<Produto> catalogo) {
        List<String> comprados = historico.getOrDefault(nomeCliente, List.of());

        return catalogo.stream()
                .filter(p -> !comprados.contains(p.getNome())) // exclui já comprados
                .limit(3)
                .toList();
    }
}
