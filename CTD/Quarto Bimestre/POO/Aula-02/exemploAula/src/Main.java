import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome? ");
        String nome = sc.next();
        System.out.print("Digite o seu sobrenome? ");
        String sobrenome = sc.next();
        String inicias = String.valueOf(nome.charAt(0)) + sobrenome.charAt(0);
        System.out.print("Digite o dia do seu nascimento: ");
        int dia = sc.nextInt();
        System.out.print("Digite o mes do seu nascimento: ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano do seu nascimento: ");
        int ano = sc.nextInt();
        System.out.println();

        System.out.println("Seu nome é: " + nome + " " + inicias + " " + sobrenome);
        System.out.println("Sua data de nascimento é: " + dia + "/" + String.format("%02d", mes) + "/" + ano);

        sc.close();
    }
}
