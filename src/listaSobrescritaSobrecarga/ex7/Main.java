package listaSobrescritaSobrecarga.ex7;

/*  previsão de saída:
 Mensagem da classe A
 Mensagem da classe B
 Mensagem da classe B

objC imprime mensagem da classe B porque C não sobrescreve nada.
C extends B, ou seja, a classe C é filha da classe B, que é filha
da classe A. Quando o java procura o método mostrarMensagem()
para objC, ele começa na classe C. Como ela não tem método, ele
sobe para o B, encontra a versão que está sobrescriata e usa ela,
como ja encontrou na B, ele para ali e nunca chega na versão A

 */
public class Main {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.mostrarMensagem();
        objB.mostrarMensagem();
        objC.mostrarMensagem();
    }
}
