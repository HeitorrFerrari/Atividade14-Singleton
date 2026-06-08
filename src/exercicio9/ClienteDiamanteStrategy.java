package exercicio9;

public class ClienteDiamanteStrategy implements FidelidadeStrategy {
    private static final double LIMITE_DOBRO = 500.0;

    @Override
    public int calcularPontos(double valorCompra) {
        int pontos = (int) (valorCompra / 2);
        if (valorCompra > LIMITE_DOBRO) {
            pontos *= 2;
            System.out.println("Compra acima de R$ 500,00 — pontuação dobrada");
        }
        return pontos;
    }
}