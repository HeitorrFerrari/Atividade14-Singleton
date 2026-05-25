
public class Main {
    public static void main(String[] args) {

        ConexaoDb conexao1 = ConexaoDb.getInstancia();
        conexao1.conectar();
        ConexaoDb conexao2 = ConexaoDb.getInstancia();
        conexao2.conectar();

        System.out.println(conexao1 == conexao2);

        conexao1.desconectar();

    }
}