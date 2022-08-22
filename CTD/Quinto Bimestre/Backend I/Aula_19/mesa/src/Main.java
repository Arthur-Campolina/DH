import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Contato> contatos = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            Contato c = new Contato("c" + String.valueOf(i), "c" + String.valueOf(i) + "@gmail.com", "9999-999" + i);
            contatos.add(c);
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("contatos.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(contatos);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Contato> contatosList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("contatos.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            contatosList = (List<Contato>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }

        int i = 1;
        for (Contato c : contatosList) {
            System.out.println("Contato: " + i++);
            System.out.println(c);
            System.out.println();
        }
    }
}
