package exercicio10;

import java.util.List;

public class Produto {
    private String nome;
    private String categoria;
    private int vendas;

    public Produto(String nome, String categoria, int vendas) {
        this.nome = nome;
        this.categoria = categoria;
        this.vendas = vendas;
    }

    public String getNome()      { return nome; }
    public String getCategoria() { return categoria; }
    public int getVendas()       { return vendas; }

    @Override
    public String toString() {
        return nome + " [" + categoria + "]";
    }
}
