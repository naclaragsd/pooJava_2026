package atvEstudar;

public class Main {
    public static void main(String[] args){
        Elevador elevador1 = new Elevador("Elevador A",200.00);
        Pessoa ana = new Pessoa("Ana", 60.0);
        System.out.println(elevador1.entrar(ana));

        Pessoa edy = new Pessoa("Edy",30.0);
        System.out.println(elevador1.entrar(edy));


    }
}
