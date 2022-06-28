import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Obra o1 = new Obra(1, "R: São João, 32 - Nova Suiça", sdf.parse("20/12/2021"), sdf.parse("17/05/2022"), sdf.parse("17/05/2022"));
            Departamento d1 = new Departamento(1, "Liberty", "BH", Estado.ACABADO, o1, 5, 4);

            Obra o2 = new Obra(1, "R: São João, 32 - Nova Suiça", sdf.parse("20/12/2021"), sdf.parse("17/05/2022"), sdf.parse("17/05/2022"));
            Departamento d2 = new Departamento(2, "Plaza", "BH", Estado.ACABADO, o2, 6, 6);

            System.out.println(d1);

            if (d1.terminouNaData()) {
                System.out.println("Departamento " + d1.getNome() + " foi terminado na data");
            } else {
                System.out.println("Departamento " + d1.getNome() + " não foi terminado na data");
            }

            if (d1.compareTo(d2) > 0) {
                System.out.println("Departamento " + d1.getNome() + " é maior que " + d2.getNome());
            } else if (d1.compareTo(d2) == 0){
                System.out.println("Departamento " + d2.getNome() + " é igual ao " + d1.getNome());
            } else {
                System.out.println("Departamento " + d2.getNome() + " é menor que " + d1.getNome());
            }

            if (d1.arranhaCeu()) {
                System.out.println(d1.getNome() + " é um arranha céu");
            } else {
                System.out.println(d1.getNome() + " não é um arranha céu");
            }
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
