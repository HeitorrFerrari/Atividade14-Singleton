package exercicio2;

public class ImpostoSP implements ImpostoStrategy {
    @Override
    public double calcular(double valor) {
        return valor * 0.18;
    }

    @Override
    public String getEstado() {
        return "SP";
    }
}
