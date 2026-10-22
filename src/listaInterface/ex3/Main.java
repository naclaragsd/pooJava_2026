package listaInterface.ex3;

public class Main {
    public static void main(String[] args){

        TrabalhavelRemotamente r1 = new Desenvolvedor("Ana", "222222",500000,"Java");
        TrabalhavelRemotamente r2 = new ConsultorExterno();

        r1.trabalharDeCasa();
        r2.trabalharDeCasa();
    }
}
