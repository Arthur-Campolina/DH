import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cachorro> segunda = new ArrayList<>();
        ArrayList<Cachorro> terca = new ArrayList<>();
        ArrayList<Cachorro> quarta = new ArrayList<>();
        ArrayList<Cachorro> quinta = new ArrayList<>();
        ArrayList<Cachorro> sexta = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            Cachorro c = new Cachorro("c" + String.valueOf(i), "r" + String.valueOf(i), i, "d" + String.valueOf(i));

            segunda.add(c);
            terca.add(c);
            quarta.add(c);
            quinta.add(c);
            sexta.add(c);
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("cachorros.dias");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(segunda);
            objectOutputStream.writeObject(terca);
            objectOutputStream.writeObject(quarta);
            objectOutputStream.writeObject(quinta);
            objectOutputStream.writeObject(sexta);

            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("cachorros.dias");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            ArrayList<Cachorro> dias;

            for (int i = 0; i < 5; i++) {
                System.out.println("Dia: " + i++);
                System.out.println("=======================================");
                dias = (ArrayList<Cachorro>) objectInputStream.readObject();

                for(Cachorro c : dias) {
                    System.out.println(c);
                }
            }

            objectInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
