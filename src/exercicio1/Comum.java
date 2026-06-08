package exercicio1;

public class Comum implements TipoPessoa {
    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.05;
    }
}
