package simuladorAutomotivo;

public class Carro {
    private String modelo;
    private String placa;

    private Condutor motorista;
    private Chassi chassi;
    private Tanque tanque;
    private Motor motor;
    private Pneu[] pneu;
    private Gps gps;
    private Radio som;

    public Carro (String modelo, String placa, Pneu[] pneus){
        this.modelo = modelo;
        this.placa = placa;
        this.pneu = pneus;

        this.chassi = new Chassi("ABC123");
        this.motor = new Motor(1222);
        this.tanque = new Tanque(23);
    }

    public void entrar(Condutor condutor){
        this.motorista = condutor;
    }
    public void sair(){
        this.motorista = null;
    }

    public void instalarRadio(Radio radio){
        this.som = radio;
    }
    public void retirarRadio(){
        this.som = null;
    }

    public void conectarGps(Gps gps){
        this.gps = gps;
    }
    public void desconectarGps(){
        this.gps = null;
    }

    public void receberCombustivel(double qtdLitros){
        this.tanque.encher(qtdLitros);
    }

    public void trocarPneu(Pneu pneu){
        this.pneu[0] = pneu;
    }
}
