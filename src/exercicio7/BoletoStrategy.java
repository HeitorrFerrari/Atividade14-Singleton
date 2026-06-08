package exercicio7;

public class BoletoStrategy implements PagamentoStrategy {
    private String cpfCliente;

    public BoletoStrategy(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    @Override
    public void processar(double valor) {
        String codigoBoleto = "23790." + cpfCliente.replaceAll("[^0-9]", "").substring(0, 5);
        System.out.printf("Boleto de R$ %.2f gerado para o CPF %s%n", valor, cpfCliente);
        System.out.println("Código: " + codigoBoleto + " | Vencimento: 3 dias úteis.");
    }
}
