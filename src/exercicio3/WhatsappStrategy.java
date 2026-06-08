package exercicio3;

public class WhatsappStrategy implements NotificacaoStrategy {

    @Override
    public void enviar(String mensagem, String destinatario) {
        System.out.println("Enviando WhatsApp para " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}