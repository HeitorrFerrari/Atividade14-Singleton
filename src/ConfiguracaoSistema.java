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

//4. Singleton para gerenciamento de configurações
//O sistema precisa acessar configurações globais, como:
//
//URL do banco de dados;
//nome da aplicação;
//ambiente de execução;
//chave de API.
//Implemente uma classe ConfiguracaoSistema utilizando o padrão Singleton.