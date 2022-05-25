import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Cachorro cachorro = new Cachorro("bolinha", "pitbull", 2015, 5.0, true, false);

        System.out.print(cachorro.podeAdotar(cachorro.getPeso(), cachorro.estaFerido()));
    }
}
