package exercicio9;

public class ClientePrataStrategy implements FidelidadeStrategy {
    @Override
    public int calcularPontos(double valorCompra) {
        return (int) (valorCompra / 5);
    }
}
