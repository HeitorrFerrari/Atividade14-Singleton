package exercicio2;

public class ImpostoPR implements ImpostoStrategy {
    @Override
    public double calcular(double valor) {
        return valor * 0.12;
    }

    @Override
    public String getEstado() {
        return "PR";
    }
}
