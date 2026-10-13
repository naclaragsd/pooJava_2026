package listaSobrescritaSobrecarga.ex10;

public class Main {
    public static void main(String[] args){

        Funcionario f = new Funcionario("Ana","111",3000.00);
        Funcionario g = new Funcionario("Gerard Way","333",2000.00);

        System.out.printf("Bonus de %s: R$%.2f\n", f.getNome(), f.getBonus());
        System.out.printf("Bonus de %s: R$%.2f\n", g.getNome(), g.getBonus());
    }
}
