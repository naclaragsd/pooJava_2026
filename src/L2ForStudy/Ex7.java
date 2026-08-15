package L2ForStudy;

public class Ex7 {
    public static void main(String[] args){

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.setNome("Guitarra");
        p1.setPreco(2000);

        p2.setNome("Bateria");
        p2.setPreco(5000);

        p1.aplicarDesconto(30);
        String nomeDoP1 = p1.getNome();
        double precoDoP1 = p1.getPreco();

        p2.aplicarDesconto(20);
        String nomeDoP2 = p2.getNome();
        double predoDoP2 = p2.getPreco();

        System.out.printf("\nPRODUTO 1: \nnome: %s\npreço: %f \n\nPRODUTO 2: \nnome: %s\npreço: %f \n",
                nomeDoP1, precoDoP1, nomeDoP2, predoDoP2);
    }
}
