import entities.Client;
import entities.Contract;
import entities.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Client client = new Client();
        Contract contract = new Contract();
        List<Product> products = new ArrayList<>();

        System.out.print("Qual o nome do client? ");
        String name = sc.next();
        client.setName(name);

        System.out.print("Qual o tipo de festa você deseja contratar? ");
        String contractType = sc.next();
        contract.setContractType(contractType);
        System.out.print("Qual a quantidade de pessoas você deseja convdar? ");
        Integer qtdGuests = sc.nextInt();
        contract.setQtdGuests(qtdGuests);
        System.out.print("Qual a data do evento? ");
        String eventDate = sc.next();
        contract.setEventDate(eventDate);
        System.out.print("Quantos tipos de salgado e bebidas você deseja na sua festa? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Product p1 = new Product();
            System.out.print("Qual é o nome da bebida/comida que o cliente gostaria ");
            String name = sc.next();
            p1.setName(name);
            System.out.print("Qual é o marca da bebida/comida que o cliente gostaria ");
            String brand = sc.next();
            p1.setBrand(brand);
            System.out.print("Qual é a quantidade da bebida/comida que o cliente gostaria ");
            int qtd = sc.nextInt();
            p1.setQtd(qtd);
            System.out.print("Qual é o preço da bebida/comida que o cliente gostaria ");
            Double price = sc.nextDouble();
            p1.setPrice(price);
            products.add(p1);
        }
        contract.

        System.out.println("O resumo da sua festa é:");
        contract.toString();



        sc.close();
    }
}
