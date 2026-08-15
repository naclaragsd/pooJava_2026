package L2ForStudy;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroConta;

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setTitular(String novoTitular){
        if(novoTitular != null && !novoTitular.isEmpty()){
            this.titular = novoTitular;
            System.out.printf("\nTitular: %s",novoTitular);
        }else{
            System.out.printf("\nTitular inválido!");
        }
    }

    public void setNumeroConta(int novoNumeroConta){
        if(novoNumeroConta >= 1000000 && novoNumeroConta <= 9999999){
            this.numeroConta = novoNumeroConta;
            System.out.printf("\nNumero da conta: %d\n",novoNumeroConta);
        }else{
            System.out.printf("\nnúmero da conta inválido!\n");
        }
    }

    public void depositar(double depositado){
        if(depositado > 0){
            this.saldo = this.saldo + depositado;
            System.out.printf("\nSaldo após o depósito: %f",this.saldo);
        }else{
            System.out.printf("\nImpossível depositar esse valor!");
        }
    }

    public void sacar(double retirar){
        if(retirar > 0 && retirar <= this.saldo){
            this.saldo = this.saldo - retirar;
            System.out.printf("\nSaldo após a retirada: %f",this.saldo);
        }else{
            System.out.printf("\nImpossível retirar esse valor!");
        }
    }
}
