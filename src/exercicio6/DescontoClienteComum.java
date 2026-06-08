package exercicio6;

public class DescontoClienteComum implements DescontoStrategy {
    private static final double DESCONTO = 0.05;

    @Override
    public double calcularDesconto(double valorOriginal) {
        double maximo = ConfiguracaoDesconto.getInstancia().getDescontoMaximo();
        double desconto = Math.min(DESCONTO, maximo);
        return valorOriginal * (1 - desconto);
    }
}
