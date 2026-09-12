package simuladorAutomotivo;

public class Condutor {
    private String nome;
    private String cnh;

    private Chave chavePrincipal;

    public Condutor(String nome, String cnh){
        this.nome = nome;
        this.cnh = cnh;
    }

    public void pegarChave(Chave chave){
        this.chavePrincipal=chave;
    }

    public void soltarChave(){
        this.chavePrincipal = null;
    }
}
