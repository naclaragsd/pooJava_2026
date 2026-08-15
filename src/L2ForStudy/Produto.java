package L2ForStudy;

public class Produto {
    // private: só métodos DENTRO desta classe podem acessá-los diretamente
    private String nome;
    private double preco;

    // GETTER: só LÊ o valor, não muda nada. Por isso retorna um tipo (double).
    public double getPreco(){
        return this.preco;
    }

    // SETTER: tenta ALTERAR o valor, com validação antes. Por isso é void (não retorna nada)
    public void setPreco(double novoPreco) {
        if (novoPreco > 0) { // guardião: só aceita preço positivo
            this.preco = novoPreco;
            System.out.printf("\nNovo preço: %f\n",novoPreco);
        }else{
            System.out.printf("\nAlteração recusada!"); // recusa e mantém o valor antigo
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        if(novoNome != null && !novoNome.isEmpty()){
            this.nome = novoNome;
            System.out.printf("\nNovo nome: %s",novoNome);
        }else{
            System.out.printf("\nAlteração recusada!\n");
        }
    }

    public void aplicarDesconto(double percentual){
        double reducao = this.preco * (percentual/100);
        this.preco = this.preco - reducao;
    }
}
