package listaSobrescritaSobrecarga.ex1;

public class Main{
public static void main(String[] args) {

    Veiculo A = new Carro("Chevrolet","Astra");
    Veiculo B = new Moto("Honda","CB 300");
    Veiculo C = new Veiculo("Boeing","737");

    System.out.printf("Pedagio: R$%.2f\n",A.calcularPedagio());
    System.out.printf("Pedagio: R$%.2f\n",B.calcularPedagio());
    System.out.printf("Pedagio: R$%.2f",C.calcularPedagio());

    }
}
