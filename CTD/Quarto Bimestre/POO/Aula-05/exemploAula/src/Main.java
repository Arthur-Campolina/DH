import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cliente cl = new Cliente(1, "Pedro", 100.00 );
        cl.aumentarDivida(10.52);
        cl.pagarDivida(5.50);

        System.out.print("Sua divida é de: " + cl.getDivida());
        sc.close();
    }
}
