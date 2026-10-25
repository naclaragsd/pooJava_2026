package listaInterface.ex6;
    /*
    por que não compilava: Uma interface é um contrato. Quando uma classe faz "implements
    imprimivel", ela se compromete a implementar TODOS os metodos da interface. O
    contrato Imprimivel tem duas clausulas: imprimir() e getCabecalho(). A classe
    RelatorioPDF só implementou imprimir() e deixou de cumprir a clausula getCabecalho(),
    então o Java não deixa compilar

    para corrigir, basta implementar o metodo getCabecalho() na classe, com @Override,
    retornando uma String.
     */
    public class RelatorioPDF implements Imprimivel{

        @Override
        public void imprimir(){
            System.out.printf("ImprimindoPDF...");
        }

        @Override
        public String getCabecalho(){
            return "Relatorio PDF - vendas do mês\n";
        }
    }
