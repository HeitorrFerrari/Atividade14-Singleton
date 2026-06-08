package exercicio1;

public class CalcularDesconto {

    private TipoPessoa strategy;

    public CalcularDesconto(TipoPessoa strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TipoPessoa strategy) {
        this.strategy = strategy;
    }

    public double calcularDesconto(double valorCompra) {
        return strategy.calcularDesconto(valorCompra);
    }
}
