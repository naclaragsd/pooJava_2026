package L2ForStudy;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    // CONSTRUTOR (nome é um identificador): define o nome só UMA VEZ, na criação do objeto.
    public Aluno(String nome) {
        this.nome = nome;
    }

    // GETTER: só LÊ o valor (não recebe nada, não altera nada)
    public String getNome(){
        return this.nome;
    }

    public double getNota1(){
        return this.nota1;
    }

    public double getNota2(){
        return this.nota2;
    }

    // SETTER: valida ANTES de guardar
    public void setNota1(double novan1){
        if (novan1 >= 0 && novan1 <= 10){
            this.nota1 = novan1;
            System.out.printf("\nNota 1 : %f",novan1);
        }else{
            System.out.printf("\nNota inválida!");
        }
    }

    public void setNota2(double novan2){
        if(novan2 >= 0 && novan2 <=10){
            this.nota2 = novan2;
            System.out.printf("\nNota 2 : %f",novan2);
        }else{
            System.out.printf("\nNota inválida!");
        }
    }

    public double calcularMedia(){
        double media = (this.nota1 + this.nota2) / 2;
        return media;
    }

    // Reaproveita calcularMedia() em vez de recalcular a fórmula de novo
    // (evita duplicar a mesma conta em dois lugares diferentes)
    public String verificarAprovacao(){
        if(this.calcularMedia() >= 7 ){
           return "Aprovado\n";
        }else{
           return "Reprovado\n";
        }
    }
}
