import java.io.*;
public class Teste{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*Salvar o objeto em um arquivo*/
        FileOutputStream fo = new FileOutputStream("OutputFile.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        Object pessoa = null;
        oos.writeObject(pessoa);

        /*Recuperar o objeto de um arquivo*/
        FileInputStream fi = new FileInputStream("OutputFile.txt");
        ObjectInputStream ois = new ObjectInputStream(fi);

        System.out.println(ois.readObject());
        oos.close();
    }
}