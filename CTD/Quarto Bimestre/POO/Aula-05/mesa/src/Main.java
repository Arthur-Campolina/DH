import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        UsuarioJogo usuario1 = new UsuarioJogo("João", "Joazin", "0", 1);
        usuario1.setNome("Marcus");
        System.out.println(usuario1.getNome());

        UsuarioJogo usuario2 = new UsuarioJogo("Raphael", "Rapha", "0", 10);
        usuario2.setNickname("Raphinha");
        System.out.print(usuario2.getNickname());


        sc.close();
    }
}
