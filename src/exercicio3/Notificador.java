package exercicio3;

public class Notificador {

    private NotificacaoStrategy strategy;

    public void setStrategy(NotificacaoStrategy strategy) {
        this.strategy = strategy;
    }

    public void notificar(String mensagem, String destinatario) {
        strategy.enviar(mensagem, destinatario);
    }
}