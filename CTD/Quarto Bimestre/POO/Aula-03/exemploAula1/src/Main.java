import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int n = sc.nextInt();

        if (n >= 2 && ePrimo(n)) {
            System.out.print("é primo!");
        } else {
            System.out.print("não é primo!");
        }
    }

    private static boolean ePrimo(int n) {
        boolean primo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}
