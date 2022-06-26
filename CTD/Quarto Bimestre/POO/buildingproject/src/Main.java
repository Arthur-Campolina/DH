import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Obra o1 = new Obra(1, "R: São João, 32 - Nova Suiça", new Date(26 / 6 / 2022), new Date(26 / 6 / 2022), new Date(26 / 6 / 2022));
        Departamento d1 = new Departamento(1, "Liberty", "BH", Estado.ACABADO, o1, 5, 4);

        Obra o2 = new Obra(1, "R: São João, 32 - Nova Suiça", new Date(26 / 6 / 2022), new Date(26 / 6 / 2022), new Date(26 / 6 / 2022));
        Departamento d2 = new Departamento(2, "Plaza", "BH", Estado.ACABADO, o2, 6, 6);

        System.out.println(d1);

        if (d1.terminouNaData()) {
            System.out.println("Departamento " + d1.getNome() + " foi terminado na data");
        } else {
            System.out.println("Departamento " + d1.getNome() + " não foi terminado na data");
        }

        if (d1.compareTo(d2) > 0) {
            System.out.println("Departamento " + d1.getNome() + " é maior que " + d2.getNome());
        } else {
            System.out.println("Departamento " + d2.getNome() + " é maior que " + d1.getNome());
        }

        if (d1.arranhaCeu()) {
            System.out.println(d1.getNome() + " é um arranha céu");
        } else {
            System.out.println(d1.getNome() + " não é um arranha céu");
        }
    }
}
