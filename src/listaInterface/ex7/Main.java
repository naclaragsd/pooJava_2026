package listaInterface.ex7;

public class Main {
    public static void main(String[] args){

        Usuario a1 = new Usuario("Ana","ana@email.com");
        Produto p1 = new Produto("Caderno",25.00);

        System.out.println(a1.toCSV());
        System.out.println(p1.toCSV());
    }
}
