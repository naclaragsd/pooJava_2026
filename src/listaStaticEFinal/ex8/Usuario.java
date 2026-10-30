package listaStaticEFinal.ex8;

/*
por ValidacaoUtil ser uma classe utilitaria, da para usar de novo; Uma vez montada,
pode ser usada em qualquer lugar
 */
import listaStaticEFinal.ex7.ValidacaoUtil;

public class Usuario {
    private String email;

    public void setEmail(String email) {
        if (ValidacaoUtil.isEmailValido(email)) {
            this.email=email;
        }else{
            System.out.println("Email invalido: "+email);
        }
    }

    public String getEmail() {
        return email;
    }
}

/*
    o exercicio quer impedir que um usuário fique com um email errado guardado
    essa classe usuário é a ficha de cadastro de uma pessoa, com um campo pro email
    setEmail é o jeito de escrever nesse campo, tudo que entrar na ficha vai passar
    por ele, ValidacaoUtil é o "porteiro", você mostra um email para ele, e ele responde
    “pode” (true) ou “não pode” (false)
*/
