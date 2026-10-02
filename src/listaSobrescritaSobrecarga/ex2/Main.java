package listaSobrescritaSobrecarga.ex2;

public class Main {
    public static void main(String[] args){

        Animal animalA = new Cachorro();
        Animal animalB = new Gato();
        Animal animalC = new Animal();

        System.out.printf("Som: ");
        animalA.emitirSom();

        System.out.printf("\n");

        System.out.printf("Som: ");
        animalB.emitirSom();

        System.out.printf("\n");

        System.out.printf("Som: ");
        animalC.emitirSom();
    }
}
