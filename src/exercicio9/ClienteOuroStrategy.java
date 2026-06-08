package exercicio9;

public class ClienteOuroStrategy implements FidelidadeStrategy {
    @Override
    public int calcularPontos(double valorCompra) {
        return (int) (valorCompra / 2);
    }
}