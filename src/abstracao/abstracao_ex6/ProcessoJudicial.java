package abstracao.abstracao_ex6;

/*

ProcessoJudicial precisa ser abstract por causa da linha:
public abstract void validarDocumentos();

toda classe que tem pelo menos um metodo abstrato precisa ser abstract
se ela fosse concreta, seria possivel fazer new processoJudicial() e chamar
iniciarProcesso(), que chama validarDocumentos(). como esse metodo nao tem
corpo, o java nao teria o que executar, por isso, ao remover a palavra abstract
da classe, o codigo para de compilar

os outros (iniciarProcesso e distribuirParaVara) continuam
sendo concretos, com corpo. So a classe e o validarDocumentos são abstratos,
porque a validacao depende de cada tipo de processo, e quem implementa são
as subclasses

 */
public abstract class ProcessoJudicial {
    private int numeroProcesso;

    public void iniciarProcesso(){
        validarDocumentos();
        distribuirParaVara();
    }

    //metodo que vai depender de cada tipo de processo
    public abstract void validarDocumentos();

    private void distribuirParaVara(){
        //logica comum...
    }
}
