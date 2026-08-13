package L2ForStudy;

public class Carro {
    String marca;
    String modelo;
    int ano;

    Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano =ano;
    }

    void exibirDados(){
        System.out.printf("\nMarca: %s \nModelo: %s \nAno: %d \n",
                marca, modelo, ano);
    }
}
