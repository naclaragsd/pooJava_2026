package L2ForStudy;

public class Ex8 {
    public static void main(String[] args){

        ContaBancaria conta1 = new ContaBancaria();

        conta1.setTitular("Ana Clara");
        conta1.setNumeroConta(1234567);

        conta1.depositar(1300);
        conta1.sacar(300);

        System.out.printf("\nTitular da conta: %s\nNúmero da conta: %d\nSaldo: %f\n",
                conta1.getTitular(),
                conta1.getNumeroConta(),
                conta1.getSaldo());
    }
}
