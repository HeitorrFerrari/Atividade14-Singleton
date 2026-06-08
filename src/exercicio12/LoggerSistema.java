package exercicio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoggerSistema {

    private static LoggerSistema instancia;
    private final List<String> logs = new ArrayList<>();

    private LoggerSistema() {}

    public static LoggerSistema getInstancia() {
        if (instancia == null) {
            instancia = new LoggerSistema();
        }
        return instancia;
    }

    public void registrar(String mensagem) {
        logs.add(mensagem);
        System.out.println("[LOG] " + mensagem);
    }

    public List<String> getLogs() {
        return Collections.unmodifiableList(logs);
    }
}
