package exercicio9;

public class ClienteComumStrategy implements FidelidadeStrategy {
    @Override
    public int calcularPontos(double valorCompra) {
        return (int) (valorCompra / 10);
    }
}
