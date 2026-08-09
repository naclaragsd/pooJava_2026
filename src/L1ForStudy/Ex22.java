package L1ForStudy;

// Some apenas os números pares de 1 a 100 e exiba o resultado.

public class Ex22 {
    public static void main(String[] svg){

        int soma = 0;

        for(int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                soma = soma + i;
            }
        }

        System.out.printf("%d",soma);
    }
}
