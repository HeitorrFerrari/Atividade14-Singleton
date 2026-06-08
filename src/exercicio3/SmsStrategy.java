package exercicio3;

public class SmsStrategy implements NotificacaoStrategy {

    @Override
    public void enviar(String mensagem, String destinatario) {
        System.out.println("Enviando SMS para " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
