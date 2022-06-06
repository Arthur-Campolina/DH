import entities.Client;
import entities.Contract;
import entities.Product;

import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Client client = new Client();
        client.setId(1);
        Contract contract = new Contract();
        contract.setId(1);
        List<Product> products = new ArrayList<>();

        System.out.print("Qual o nome do cliente? ");
        String name = sc.next();
        client.setName(name);
        System.out.print("Qual o sobrenome do cliente? ");
        String surname = sc.next();
        client.setSurname(surname);
        System.out.print("Qual o telefone do cliente? ");
        String phone = sc.next();
        client.setPhone(phone);
        System.out.print("Qual o CPF do cliente? ");
        String cpf = sc.next();
        client.setCpf(cpf);

        System.out.print("Qual o tipo de festa o cliente deseja contratar? ");
        String contractType = sc.next();
        contract.setContractType(contractType);
        System.out.print("Qual é a data do evento? ");
        String eventDate = sc.next();
        contract.setEventDate (eventDate);
        System.out.print("Qual a quantidade de pessoas o cliente deseja convidar? ");
        Integer qtdGuests = sc.nextInt();
        contract.setQtdGuests(qtdGuests);
        System.out.print("Quantos tipos de salgado e bebidas o cliente deseja na festa? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Product p1 = new Product();
            System.out.print("Qual é o nome da bebida/comida o cliente gostaria? ");
            String productName = sc.next();
            p1.setName(productName);
            System.out.print("Qual é o marca da bebida/comida o cliente gostaria? ");
            String brand = sc.next();
            p1.setBrand(brand);
            System.out.print("Qual é a quantidade da bebida/comida o cliente gostaria? ");
            int qtd = sc.nextInt();
            p1.setQtd(qtd);
            System.out.print("Qual é o preço da bebida/comida o cliente gostaria? ");
            Double price = sc.nextDouble();
            p1.setPrice(price);
            products.add(p1);
            contract.addProduct(p1);
        }
        contract.setClient(client);

        System.out.println("O resumo da sua festa é: " + contract);
        sc.close();
    }
}
