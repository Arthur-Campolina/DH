import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Cachorro c = new Cachorro("c" + String.valueOf(i), i);
            cachorros.add(c);
        }

        //  Salvamos toda a coleção em um arquivo
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(cachorros);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

        //  Recuperamos toda a coleção com cada uma das paginas do arquivo
        List<Cachorro> cachorros2 = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("OutputFile.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            cachorros2 = (List<Cachorro>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }

        for(Cachorro c : cachorros2) {
            System.out.println(c);
        }
    }
}
