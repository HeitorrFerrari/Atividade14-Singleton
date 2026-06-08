package exercicio3;

public class PushNotificationStrategy implements NotificacaoStrategy {

    @Override
    public void enviar(String mensagem, String destinatario) {
        System.out.println("Enviando Push Notification para " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
