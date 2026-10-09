package abstracao.abstracao_ex1;

public class Main {
    public static void main(String[] args){

        //Veiculo v1 = new Veiculo("dfdf","dfgdg");
        // Nao compila: Veiculo e abstract, nao pode ser instanciada

        Veiculo v2 = new Moto("CB500","Honda");
        Veiculo v3 = new Carro("Ford","Ranger");

       // System.out.printf("Pedagio: R$%.2f\n",v1.calcularPedagio());
        System.out.printf("Pedagio: R$%.2f\n",v2.calcularPedagio());
        System.out.printf("Pedagio: R$%.2f\n",v3.calcularPedagio());
    }
}
