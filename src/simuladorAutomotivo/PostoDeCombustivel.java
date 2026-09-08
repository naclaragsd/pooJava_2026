package simuladorAutomotivo;

public class PostoDeCombustivel {
    private String nomeFantasia;

    public PostoDeCombustivel(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void abastecer (Carro carro, double qtdLitros){
        carro.receberCombustivel(qtdLitros);
    }
}
