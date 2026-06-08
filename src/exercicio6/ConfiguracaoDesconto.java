package exercicio6;

public class ConfiguracaoDesconto {
    private static ConfiguracaoDesconto instancia;
    private double descontoMaximo;

    private ConfiguracaoDesconto() {
        this.descontoMaximo = 0.30;
    }

    public static ConfiguracaoDesconto getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoDesconto();
        }
        return instancia;
    }

    public double getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(double descontoMaximo) {
        this.descontoMaximo = descontoMaximo;
    }
}
