import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Cachorro cachorro = new Cachorro("bolinha", "pitbull", 2015, 5.0, true, false);

        System.out.println(cachorro.podeAdotar(cachorro.getPeso(), cachorro.estaFerido()));
        System.out.print("A idade do " + cachorro.getNome() + " é: " + cachorro.idade(cachorro.getAnoNascimento()) + " anos.");
    }
}
