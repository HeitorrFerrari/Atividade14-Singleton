package exercicio6;

public class DescontoPromocional implements DescontoStrategy {
    private static final double DESCONTO = 0.50;

    @Override
    public double calcularDesconto(double valorOriginal) {
        double maximo = ConfiguracaoDesconto.getInstancia().getDescontoMaximo();
        double desconto = Math.min(DESCONTO, maximo);
        System.out.println("Desconto promocional até " + (maximo * 100) + "%");
        return valorOriginal * (1 - desconto);
    }
}
