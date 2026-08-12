package L2ForStudy;

/* Criar uma classe "Carro" com os atributos marca, modelo e ano. No main,
 instanciar um objeto dessa classe e exibir os valores dos atributos. */

public class Ex1 {
public static void main(String[] svg) {

        Carro fusca = new Carro();
        fusca.marca = "Beetle";
        fusca.modelo = "Oval";
        fusca.ano = 1990;

        System.out.printf("\n--- fusca ---\n");
        System.out.printf("marca: %s \nmodelo: %s \nano: %d\n",
                fusca.marca,
                fusca.modelo,
                fusca.ano);
    }
}
