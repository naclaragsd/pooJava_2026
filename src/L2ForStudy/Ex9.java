package L2ForStudy;

public class Ex9 {
    public static void main(String[] args){

        Livro l1 = new Livro();
        l1.titulo = "Dom Casmurro";
        l1.autor = "Machado de Assis";
        l1.anoPublicacao = 1899;
        l1.exibirInformacoes();

        Livro l2 = new Livro();
        l2.titulo = "O Pequeno Príncipe";
        l2.autor = "Antoine de Saint-Exupéry";
        l2.anoPublicacao = 1943;
        l2.exibirInformacoes();

        Livro l3 = new Livro();
        l3.titulo = "Capitães da Areia";
        l3.autor = "Jorge Amado";
        l3.anoPublicacao = 1937;
        l3.exibirInformacoes();
    }
}
