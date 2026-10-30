package listaStaticEFinal.ex8;

public class Main {
    public static void main(String[] args){

        Usuario u = new Usuario();
        u.setEmail("anaemail.com");
        System.out.println("Email guardado: " + u.getEmail());

        u.setEmail("ana@email.com");
        System.out.println("Email guardado: " + u.getEmail());
    }
}

/*
u.setEmail("anaemail.com") : nao tem @, entao o ponteiro falou false e caiu no else

println("Email guardado: " + u.getEmail()) : O email inválido foi barrado e a ficha
continua vazia, por isso Email guardado: null

u.setEmail("ana@email.com") : É válido, então entrou no primeiro bloco, que só guarda
e não tem print nenhum

println("Email guardado: " + u.getEmail()) : Agora a ficha tem o email
 */
