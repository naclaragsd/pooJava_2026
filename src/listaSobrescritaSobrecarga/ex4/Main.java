package listaSobrescritaSobrecarga.ex4;

public class Main {
    public static void main(String[] args){

        Colaborador a = new Colaborador();
        System.out.printf("Coladorador: %.2f",a.calcularFerias());

        Colaborador b = new Gerente();
        System.out.printf("\nGerente: %.2f",b.calcularFerias());

    }
}
