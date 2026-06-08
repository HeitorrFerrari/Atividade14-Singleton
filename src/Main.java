import exercicio3.*;
import exercicio6.*;
import exercicio7.*;
import exercicio9.*;
public class Main {

    public static void main(String[] args) {

        Notificador notificador = new Notificador();

        notificador.setStrategy(new EmailStrategy());
        notificador.notificar("Pedido aprovado!", "maria@gmail.com");

        notificador.setStrategy(new SmsStrategy());
        notificador.notificar("Pedido enviado!", "44999765300");

        notificador.setStrategy(new WhatsappStrategy());
        notificador.notificar("Seu pedido saiu para entrega!", "44999765300");

        notificador.setStrategy(new PushNotificationStrategy());
        notificador.notificar("Você recebeu uma nova promoção!", "Maria");

        ConfiguracaoDesconto config = ConfiguracaoDesconto.getInstancia();
        config.setDescontoMaximo(0.30);

        double valor = 100.0;
        CalculadoraDesconto contexto = new CalculadoraDesconto(new DescontoClienteComum());

        System.out.println("Valor original: R$ " + valor);
        System.out.println("─────────────────────────────");

        contexto.setStrategy(new DescontoClienteComum());
        System.out.printf("Cliente Comum  (5%%):  R$ %.2f%n", contexto.aplicarDesconto(valor));

        contexto.setStrategy(new DescontoClienteVIP());
        System.out.printf("Cliente VIP    (20%%): R$ %.2f%n", contexto.aplicarDesconto(valor));

        contexto.setStrategy(new DescontoPromocional());
        System.out.printf("Promocional    (50%%): R$ %.2f%n", contexto.aplicarDesconto(valor));

        System.out.println("─────────────────────────────");
        System.out.println("Alterando desconto máximo para 10%...");
        config.setDescontoMaximo(0.10);

        contexto.setStrategy(new DescontoClienteVIP());
        System.out.printf("Cliente VIP    (20%% → limitado): R$ %.2f%n", contexto.aplicarDesconto(valor));

        ProcessadorPagamento processador = new ProcessadorPagamento(new PixStrategy("maria@gmail.com"));
        processador.executar(250.00);

        processador.setStrategy(new CartaoCreditoStrategy("1234567890123456", 3));
        processador.executar(250.00);

        processador.setStrategy(new BoletoStrategy("123.456.789-00"));
        processador.executar(250.00);

        processador.setStrategy(new ValePresenteStrategy("VALE-6-XYZ", 100.00));
        processador.executar(250.00);

        processador.setStrategy(new ValePresenteStrategy("VALE-2026-ABC", 300.00));
        processador.executar(250.00);

        System.out.println("=== Programa de Fidelidade ===\n");

        ProgramaFidelidade clienteComum = new ProgramaFidelidade("Ana", new ClienteComumStrategy());
        clienteComum.registrarCompra(100.00);
        clienteComum.registrarCompra(55.00);

        System.out.println();

        ProgramaFidelidade clientePrata = new ProgramaFidelidade("Joao", new ClientePrataStrategy());
        clientePrata.registrarCompra(100.00);
        clientePrata.registrarCompra(55.00);

        System.out.println();

        ProgramaFidelidade clienteOuro = new ProgramaFidelidade("Maria", new ClienteOuroStrategy());
        clienteOuro.registrarCompra(100.00);
        clienteOuro.registrarCompra(55.00);

        System.out.println();

        ProgramaFidelidade clienteDiamante = new ProgramaFidelidade("Julia", new ClienteDiamanteStrategy());
        clienteDiamante.registrarCompra(300.00);
        clienteDiamante.registrarCompra(600.00);

        System.out.println();
        System.out.println("=== Resumo Final ===");
        System.out.println("Ana:    " + clienteComum.getPontosAcumulados() + " pontos");
        System.out.println("Joao:  " + clientePrata.getPontosAcumulados() + " pontos");
        System.out.println("Maria:  " + clienteOuro.getPontosAcumulados() + " pontos");
        System.out.println("Julia:  " + clienteDiamante.getPontosAcumulados() + " pontos");
    }
}