import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Cachorro dog1 = new Cachorro("Lola", 11);
        Cavalo cav1 = new Cavalo("Campolina", 31);
        Preguica pre3 = new Preguica("Lazy", 12);

        System.out.println("Cachorro: " + dog1.getNome());
        System.out.println("Idade: " + dog1.getIdade());
        System.out.println("Som: " + dog1.getSom("Auau"));
        System.out.println("Corre: " + dog1.getCorrer(22.00) + "km/h");
        System.out.println();
        System.out.println("Cavalo: " + cav1.getNome());
        System.out.println("Idade: " + cav1.getIdade());
        System.out.println("Som: " + cav1.getSom("prrruuuuu"));
        System.out.println("Corre: " + cav1.getCorrer(31.00) + "km/h");
        System.out.println();
        System.out.println("Preguiça: " + pre3.getNome());
        System.out.println("Idade: " + pre3.getIdade());
        System.out.println("Som: " + pre3.getSom("Auau"));
        System.out.println("Sobe arvores: " + pre3.getSubir(1.00) + "km/h");
    }
}
