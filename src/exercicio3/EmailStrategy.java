package exercicio3;

public class EmailStrategy implements NotificacaoStrategy {

    @Override
    public void enviar(String mensagem, String destinatario) {
        System.out.println("Enviando e-mail para " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}