package listaInterface.ex8;

public class PortaDeSeguranca implements DispositivoEletronico, Autenticavel{

    private String senha;

    public PortaDeSeguranca(String senha) {
        this.senha = senha;
    }

    @Override
    public String ligar(){
        return "porta de segurança ligada!";
    }

    @Override
    public String desligar(){
        return "Porta de segurança desligada!";
    }

    @Override
    public void autenticar(String senhaDigitada) {
        if (this.senha.equals(senhaDigitada)) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
