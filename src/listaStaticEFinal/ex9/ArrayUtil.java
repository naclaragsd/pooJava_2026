package listaStaticEFinal.ex9;

public class ArrayUtil {

    public ArrayUtil() {
    }

    public static int encontrarMaiorNumero(int[] numeros) {
        int maior = numeros[0];

        for (int n : numeros) {
            if (n > maior) {
                maior = n;
            }
        }
        return maior;
    }
}