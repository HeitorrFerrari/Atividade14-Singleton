package exercicio1;

public class Funcionario implements TipoPessoa {
    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.20;
    }
}
