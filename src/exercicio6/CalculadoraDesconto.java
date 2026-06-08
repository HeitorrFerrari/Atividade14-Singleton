package exercicio6;

public class CalculadoraDesconto {
    private DescontoStrategy strategy;

    public CalculadoraDesconto (DescontoStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(DescontoStrategy strategy) {
        this.strategy = strategy;
    }

    public double aplicarDesconto(double valorOriginal) {
        return strategy.calcularDesconto(valorOriginal);
    }
}
