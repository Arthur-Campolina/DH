public class Main {
    public static void main(String[] args) throws Exception {

        Inteiro i1 = new Inteiro();
        i1.addList(2);
        i1.tamanhoList();

        System.out.println();
        Inteiro i3 = new Inteiro();
        i3.addList(2);
        i3.addList(4);
        i3.addList(6);
        i3.addList(8);
        i3.addList(10);
        i3.tamanhoList();

        System.out.println();
        Inteiro i2 = new Inteiro();
        i2.tamanhoList();


    }
}
