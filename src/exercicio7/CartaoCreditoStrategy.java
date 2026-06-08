package exercicio7;

public class CartaoCreditoStrategy implements PagamentoStrategy {
    private String numeroCartao;
    private int parcelas;

    public CartaoCreditoStrategy(String numeroCartao, int parcelas) {
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public void processar(double valor) {
        System.out.printf("Pagamento de R$ %.2f no cartão final %s em %dx de R$ %.2f%n",
                valor, numeroCartao.substring(numeroCartao.length() - 4), parcelas, valor / parcelas);
    }
}
