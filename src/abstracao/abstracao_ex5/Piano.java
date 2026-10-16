package abstracao.abstracao_ex5;

/*

o erro estava nesta classe, InstrumentoMusical tem o metodo abstrato tocar(), que funciona
como um contrato: toda subclasse concreta é obrigada a implementa-lo. Piano herdava de
InstrumentoMusical, mas so tinha o metodo afinar() e não implementava o tocar(), por isso
não compilava

correcao: colocar tocar() no Piano com @Override. A outra opcao seria declarar Piano como
abstract, mas aí não daria para criar nenhum objeto Piano, o que não faz sentido para um
instrumento real

 */
public class Piano extends InstrumentoMusical{

    @Override
    public void tocar(){
        System.out.printf("Melodia ao piano...\n");
    }

    public void afinar(){
        System.out.printf("Afinando o piano...\n");
    }
}
