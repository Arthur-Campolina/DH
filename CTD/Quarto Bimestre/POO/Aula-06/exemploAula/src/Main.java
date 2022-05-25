import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Impressora impSenPapel = new Impressora("HP", "sem fio", LocalDate.parse("2022-05-25"));
        Impressora impComPapel = new Impressora("HP", "sem fio", LocalDate.parse("2022-05-25"), 10);

        impSenPapel.imprimir("text1");
        impComPapel.imprimir("text2");

        sc.close();
    }
}
