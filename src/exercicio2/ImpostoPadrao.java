package exercicio2;

public class ImpostoPadrao implements ImpostoStrategy {
    @Override
    public double calcular(double valor) {
        return valor * 0.10;
    }

    @Override
    public String getEstado() {
        return "PADRAO";
    }
}
