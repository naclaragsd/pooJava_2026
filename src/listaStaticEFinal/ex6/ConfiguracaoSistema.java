package listaStaticEFinal.ex6;

public class ConfiguracaoSistema {
    public static final int NUMERO_MAXIMO_LOGIN_TENTATIVAS = 5;
    public static final String URL_BLOG_DA_EMPRESA = "https://meublog.com.br";
}

/*
Static: existe 5 para o sistema inteiro e nao um por objeto, por isso no main lê
direto pela classe ConfiguracaoSistema.NUMERO_MAXIMO_LOGIN_TENTATIVAS sem o new
final: ninguém consegue trocar esse 5 por outro numero enquanto o programa roda

os dois juntos: regra fixa do sistema. Vale igual para todo mundo e nunca muda
isso chama-se constante
 */
