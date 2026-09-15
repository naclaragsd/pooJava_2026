package atvHeranca.ex5;

public class Main5 {
    public static void main(String[] args){
        Forma retangulo = new Retangulo("retangulo1", 33, 44);
        Forma circulo = new Circulo("circulo1",32);

        System.out.println("Area do retangulo: " + retangulo.calcularArea());
        System.out.println("Area do circulo: " + circulo.calcularArea());
    }
}
