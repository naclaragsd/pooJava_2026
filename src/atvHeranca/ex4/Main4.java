package atvHeranca.ex4;

public class Main4 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(12000, "Gerard",12);
        ContaPoupanca contaPoupanca = new ContaPoupanca(3000,"Ray",300);

        contaCorrente.exibirInformacoes();
        contaPoupanca.exibirInformacoes();
    }
}
