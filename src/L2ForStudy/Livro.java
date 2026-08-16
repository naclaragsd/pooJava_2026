package L2ForStudy;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    void exibirInformacoes(){
        System.out.printf("\n--- LIVRO ---\nTítulo: %s\nAutor: %s \nAno De Publicação: %d\n",
                titulo,autor,anoPublicacao);
    }
}
