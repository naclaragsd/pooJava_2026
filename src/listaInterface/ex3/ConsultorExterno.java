package listaInterface.ex3;

public class ConsultorExterno implements TrabalhavelRemotamente{

    @Override
    public void trabalharDeCasa(){
        System.out.printf("\nConsultor trabalhando remotamente...\n");
    }
}
