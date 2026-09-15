package atvHeranca.ex9;

public class Notebook extends Eletronico{
    private String memoriaRAM;

    public Notebook(String marca, String memoriaRAM){
        super(marca);
        this.memoriaRAM=memoriaRAM;
    }
}
