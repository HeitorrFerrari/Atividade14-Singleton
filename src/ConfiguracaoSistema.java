public class ConfiguracaoSistema {
    private String url;
    private String nomeAplicacao;
    private String ambienteExecucao;
    private String ApiKey;

    private static ConfiguracaoSistema configuracaoSistema = new ConfiguracaoSistema();

    private ConfiguracaoSistema() {
    }

    public static ConfiguracaoSistema getInstance() {
        return configuracaoSistema;
    }

}
