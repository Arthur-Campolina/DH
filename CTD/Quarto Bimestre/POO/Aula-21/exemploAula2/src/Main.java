import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<PecaReposicao> pecas = new ArrayList<>();
        pecas.add(new PecaReposicao("Motor", 50.00));
        Locale.setDefault(Locale.US);
        Reparo reparo = new Reparo("Liquidificador", 100.00);
        reparo.proximo();
        reparo.getEstado().somaPecaReposicao(pecas);
        reparo.proximo();
        reparo.getEstado().mudarEndereco("Rua a, 1");
        reparo.proximo();

        if(reparo.getEstado() instanceof Finalizado) {
            System.out.println("Finalizado!");
        }
    }
}
