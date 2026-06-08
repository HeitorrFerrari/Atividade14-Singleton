package exercicio7;

public class ValePresenteStrategy implements PagamentoStrategy {
    private String codigoVale;
    private double saldoVale;

    public ValePresenteStrategy(String codigoVale, double saldoVale) {
        this.codigoVale = codigoVale;
        this.saldoVale = saldoVale;
    }

    @Override
    public void processar(double valor) {
        if (saldoVale >= valor) {
            System.out.printf("Vale-presente [%s] utilizado: R$ %.2f debitados. Saldo restante: R$ %.2f%n",
                    codigoVale, valor, saldoVale - valor);
        } else {
            System.out.printf("Saldo insuficiente no vale [%s]. Saldo: R$ %.2f | Necessário: R$ %.2f%n",
                    codigoVale, saldoVale, valor);
        }
    }
}
