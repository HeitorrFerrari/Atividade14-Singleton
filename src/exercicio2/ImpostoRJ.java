package exercicio2;

public class ImpostoRJ implements ImpostoStrategy {
    @Override
    public double calcular(double valor) {
        return valor * 0.20;
    }

    @Override
    public String getEstado() {
        return "RJ";
    }
}
