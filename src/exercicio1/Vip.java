package exercicio1;

public class Vip implements TipoPessoa {
    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.10;
    }
}
