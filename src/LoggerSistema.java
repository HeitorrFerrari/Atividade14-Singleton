public class LoggerSistema {

    private static LoggerSistema instancia;

    private LoggerSistema() {
    }

    public static LoggerSistema getInstance() {
        if (instancia == null) {
            instancia = new LoggerSistema();
        }
        return instancia;
    }

    public void log(String mensagem) {
        System.out.println("[LOG] " + mensagem);
    }
}