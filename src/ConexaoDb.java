public class ConexaoDb {

    private static ConexaoDb instancia;

    private ConexaoDb() {
        System.out.println("Conexao com o banco estabelecida!");
    }

    public static ConexaoDb getInstancia() {
        if (instancia == null) {
            instancia = new ConexaoDb();
        }
        return instancia;
    }

    public void conectar () {
        System.out.println("Conectando com o banco de dados!");
    }

    public void executarComando (String comando) {
        System.out.println("Executando comando: " + comando);
    }

    public void desconectar  () {
        System.out.println("Desconectando Banco!");
    }

}
