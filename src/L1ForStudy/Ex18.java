package L1ForStudy;

//Exiba os números ímpares de 1 a 20.

public class Ex18 {
    public static void main(String[] svg){

        for(int i=1; i<=20; i++){
            if(i % 2 != 0){
                System.out.printf("| %d |",i);
            }
        }
    }
}
