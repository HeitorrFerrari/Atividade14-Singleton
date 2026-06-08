package exercicio9;

public class ProgramaFidelidade {
    private String nomeCliente;
    private FidelidadeStrategy strategy;
    private int pontosAcumulados;

    public ProgramaFidelidade(String nomeCliente, FidelidadeStrategy strategy) {
        this.nomeCliente = nomeCliente;
        this.strategy = strategy;
        this.pontosAcumulados = 0;
    }

    public void setStrategy(FidelidadeStrategy strategy) {
        this.strategy = strategy;
    }

    public void registrarCompra(double valorCompra) {
        int pontos = strategy.calcularPontos(valorCompra);
        pontosAcumulados += pontos;
        System.out.printf(" %s comprou R$ %.2f → +%d pontos (total: %d pontos)%n",
                nomeCliente, valorCompra, pontos, pontosAcumulados);
    }

    public int getPontosAcumulados() {
        return pontosAcumulados;
    }
}