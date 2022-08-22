import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fi = new FileInputStream("InputFile.txt");
        BufferedInputStream bi = new BufferedInputStream(fi);

        try {
            int i;
            while ((i=bi.read()) != -1) {
                System.out.println((char)i);
            }
            bi.close();
            fi.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
