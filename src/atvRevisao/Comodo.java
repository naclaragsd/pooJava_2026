package atvRevisao;

public class Comodo {
    private String nome;
    private int cargaMaximaWatts;
    private Dispositivo[] dispositivosInteligentes; //existe um array do tipo Dispositivo (sem tamanho)
    private int quantidadeAtual;

    public Comodo(String nome, int cargaMaximaWatts){
        this.nome = nome;
        this.cargaMaximaWatts = cargaMaximaWatts;

        this.dispositivosInteligentes = new Dispositivo[10]; //construtor usa new para criar o array com 10 posições vazias
        this.quantidadeAtual = 0;
    }

    private int somaWatts(){
        int soma = 0;

        for(int i = 0; i < quantidadeAtual; i++){
            soma = soma + this.dispositivosInteligentes[i].getConsumoWatts();
        }

        return soma;
    }

    public boolean adicionarDispositivo(Dispositivo d){
        if(quantidadeAtual < dispositivosInteligentes.length){
            int consumoTotal = this.somaWatts() + d.getConsumoWatts();

            if(consumoTotal <= cargaMaximaWatts){
                dispositivosInteligentes[quantidadeAtual] = d;
                quantidadeAtual++;
                d.setComodo(this);
                return true;
            }
        }
        return false;
    }
    public String getNome(){
        return this.nome;
    }

}
