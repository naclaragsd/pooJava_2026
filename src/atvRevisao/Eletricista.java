package atvRevisao;

public class Eletricista {
    private String nome;
    private String registroCrea;

    public Eletricista(String nome, String registroCrea){
        this.nome = nome;
        this.registroCrea = registroCrea;
    }

    public void reiniciarAparelho(Dispositivo dispositivo){
        dispositivo.setLigado(false);
        dispositivo.setLigado(true);
        System.out.println("O eletricista "+ this.nome + " reiniciou o dispositivo " + dispositivo.getNome());
    }
}
