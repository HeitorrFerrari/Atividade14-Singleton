import exercicio3.*;

public class Main {

    public static void main(String[] args) {

        Notificador notificador = new Notificador();

        notificador.setStrategy(new EmailStrategy());
        notificador.notificar("Pedido aprovado!", "maria@email.com");

        notificador.setStrategy(new SmsStrategy());
        notificador.notificar("Pedido enviado!", "44999765300");

        notificador.setStrategy(new WhatsappStrategy());
        notificador.notificar("Seu pedido saiu para entrega!", "44999765300");

        notificador.setStrategy(new PushNotificationStrategy());
        notificador.notificar("Você recebeu uma nova promoção!", "Maria");
    }
}