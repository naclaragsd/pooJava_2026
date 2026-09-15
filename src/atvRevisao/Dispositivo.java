package atvRevisao;

public class Dispositivo {
    private String nome;
    private int consumoWatts;
    private boolean ligado;
    private Comodo comodo;


    public Dispositivo(String nome, int consumoWatts) {
        this.nome = nome;
        this.consumoWatts = consumoWatts;
    }

    public int getConsumoWatts() {
        return this.consumoWatts;
    }

    public void setComodo(Comodo c){
        this.comodo = c;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public String getNome(){
        return this.nome;
    }

    public Comodo getComodo(){
        return this.comodo;
    }

}

/* --------------------- get/set Dispositivo e comodo ------------------------------------

 Get e set aqui são métodos que ficam DENTRO DE DISPOSITIVO, para permitir que outras
  classes (comodo ou main) leiam/mudem o atributo comodo que ja mora dentro de um objeto
  Dispositivo; É como se o dispositivo disesse que tem uma gaveta chamada comodo e se
  alguém de fora quiser guardar algo nela, tem que usar esse metodo, que seria a "porta
  aberta para fazer isso"

  porque a classe Comodo não tem get/set?
  eles existem atributo por atributo, e só quando alguém de FORA da classe onde o atributo
  mora precisa tocar nele. Se ninguém de fora precisa, não existe motivo para criar

  no comodo: ele já vê o Dispositivo (via parâmetro), mas alguns ATRIBUTOS específicos
  dele são privados, então crio um get/set para cada atributo especifico que precisa
  ser lido ou escrito de fora
 */

