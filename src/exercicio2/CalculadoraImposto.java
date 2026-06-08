package exercicio2;

import java.util.HashMap;
import java.util.Map;

public class CalculadoraImposto {

    private final Map<String, ImpostoStrategy> estrategias = new HashMap<>();
    private final ImpostoStrategy padrao = new ImpostoPadrao();

    public CalculadoraImposto() {
        registrar(new ImpostoPR());
        registrar(new ImpostoSP());
        registrar(new ImpostoRJ());
    }

    public void registrar(ImpostoStrategy strategy) {
        estrategias.put(strategy.getEstado(), strategy);
    }

    public double calcular(String estado, double valor) {
        ImpostoStrategy strategy = estrategias.getOrDefault(estado.toUpperCase(), padrao);
        return strategy.calcular(valor);
    }
}
