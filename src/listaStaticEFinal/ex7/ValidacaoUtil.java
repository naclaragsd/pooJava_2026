package listaStaticEFinal.ex7;

public class ValidacaoUtil {

    //construtor vazio pq nao precisa fazer nada, a única função dele é ser private
    private ValidacaoUtil(){
    }

    /*
    contains: metodo que todo String já tem pronto, ele pergunta: "esse texto tem
    isso aqui dentro?" e aí responde true ou false
     */
    public static boolean isEmailValido(String email){
        return email.contains("@") && email.contains(".");
    }
}
