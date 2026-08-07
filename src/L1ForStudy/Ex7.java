package L1ForStudy;

/* Converta um valor em reais para dólares,
considerando uma taxa fixa de câmbio. */

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] svg){
        Scanner leitor = new Scanner(System.in);

        System.out.printf("\nDigite um valor em reais: ");
        double val = leitor.nextDouble();

        final double TAXA_CAMBIO = 5.00;

        System.out.printf("\nO valor: R$%f convertido em dólares, \nconsiderando a taxa fixa de câmbio de R$5.00 fica: %f\n",
                val,val/TAXA_CAMBIO);
    }
}
