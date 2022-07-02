package application;

import model.entities.Account;
import model.entities.Bank;
import model.entities.CurrentAccount;
import model.exceptions.CurrentAccountException;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Account> accounts = new HashSet<>();
        Bank bank = new Bank("Banco do Brasil", "R one, 1", "77799-540", accounts);

        System.out.println(bank);
        System.out.println();
        System.out.println("Informe os dados da conta");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double balance = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double withdrawLimit = sc.nextDouble();

        CurrentAccount acc = new CurrentAccount(number, holder, balance, withdrawLimit);
        bank.addAccount(acc);

        System.out.println();
        System.out.print("Informe uma quantia para depositar: ");
        double amountDeposit = sc.nextDouble();
        acc.deposit(amountDeposit);
        System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amountWithdrawl = sc.nextDouble();
        System.out.println();
        System.out.printf("Você pagará uma taxa no valor de R$ %.2f%n", acc.getFee());
        System.out.print("Deseja Continuar (y/n): ");
        char question = sc.next().charAt(0);

        if (question == 'y') {
            try {
                acc.withdrawal(amountWithdrawl);
                System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
            } catch (CurrentAccountException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Até a próxima! =D");
        }
        sc.close();
    }
}
