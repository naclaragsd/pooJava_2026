package atvRevisao;

public class Main {
    public static void main(String[] args){

        LampadaIoT lampada = new LampadaIoT("Abajur",15,"#FFFFFF");
        ArCondicionadoIoT ar1 = new ArCondicionadoIoT("Ar 1",1500,18.0);
        ArCondicionadoIoT ar2 = new ArCondicionadoIoT("Ar 2",1500,18.0);

        Eletricista eletricista = new Eletricista("Carlos", "CREA-12345");
        eletricista.reiniciarAparelho(lampada);

        Comodo sala = new Comodo("Sala",2000);

        boolean resultadoLampada = sala.adicionarDispositivo(lampada);
        boolean resultadoAr1 = sala.adicionarDispositivo(ar1);
        boolean resultadoAr2 = sala.adicionarDispositivo(ar2);

        System.out.println("Lampada adicionada: " + resultadoLampada);
        System.out.println("Ar 1 adicionado: " + resultadoAr1);
        System.out.println("Ar 2 adicionado: " + resultadoAr2);

        Residencia residencia = new Residencia("Rua das Flores, 123","192.160.0.1");

        residencia.adicionarComodo(sala);

        System.out.println("A lampada esta no comodo: " + lampada.getComodo().getNome());
    }
}
