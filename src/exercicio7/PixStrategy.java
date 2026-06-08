package exercicio7;

public class PixStrategy implements PagamentoStrategy {
    private String chavePix;

    public PixStrategy(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processar(double valor) {
        System.out.printf(" Pix de R$ %.2f enviado para a chave: %s%n", valor, chavePix);
        System.out.println(" Pagamento confirmado.");
    }
}
