import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Tecnico t1 = new Tecnico("Joazin", 5000.00, "01", 1000.00 );
        Administrativo a1 = new Administrativo("Ursula", 7000.00, "01", false, 0.00);

        System.out.println(t1);
        System.out.println();
        System.out.println(a1);
    }
}
