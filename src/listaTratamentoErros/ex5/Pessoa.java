package listaTratamentoErros.ex5;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        if(idade < 0){
            throw new IllegalArgumentException("idade não pode ser negativa");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
