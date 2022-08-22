import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pagina> p1 = new ArrayList<>();
        ArrayList<Pagina> p2 = new ArrayList<>();
        ArrayList<Pagina> p3 = new ArrayList<>();
        ArrayList<Pagina> p4 = new ArrayList<>();
        ArrayList<Pagina> p5 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Pagina p = new Pagina("p" + String.valueOf(i), "www.p" + String.valueOf(i) + ".com.br");
            p1.add(p);
            p2.add(p);
            p3.add(p);
            p4.add(p);
            p5.add(p);
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("paginas.favoritas");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(p1);
            objectOutputStream.writeObject(p2);
            objectOutputStream.writeObject(p3);
            objectOutputStream.writeObject(p4);
            objectOutputStream.writeObject(p5);

            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("paginas.favoritas");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            ArrayList<Pagina> paginas;

            for (int i = 0; i < 5; i++) {

                System.out.println("==============================");
                paginas = (ArrayList<Pagina>) objectInputStream.readObject();

                for (Pagina p : paginas) {
                    System.out.println(p);
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
