package atvHeranca.ex8;

public class Main8 {
    public static void main(String[] args){
        Onibus onibus = new Onibus(40, 34);
        Trem trem = new Trem(70,"Trem");

        onibus.abrirPorta();
        trem.acloparVagao();
    }
}
