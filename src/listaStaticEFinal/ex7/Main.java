package listaStaticEFinal.ex7;

public class Main {
    public static void main(String[] args){
        System.out.println(ValidacaoUtil.isEmailValido("ana@email.com"));
        System.out.println(ValidacaoUtil.isEmailValido("anaemail.com"));
        System.out.println(ValidacaoUtil.isEmailValido("ana@email"));
    }
}
