package entities;

import entities.enums.ContractType;

import java.util.ArrayList;
import java.util.List;

public class Contract extends AbstractEntity {

    private Client client;
    private String contractType;
    private Integer qtdGuests;
    private String eventDate;
    private Supplier supplier;
    private List<Product> products = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public Contract() {
    }

    public Contract(Client client, String contractType, Integer qtdGuests, String eventDate, Supplier supplier, List<Product> products, List<Employee> employees) {
        super();
        this.client = client;
        this.contractType = contractType;
        this.qtdGuests = qtdGuests;
        this.eventDate = eventDate;
        this.supplier = supplier;
        this.products = products;
        this.employees = employees;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public Integer getQtdGuests() {
        return qtdGuests;
    }

    public void setQtdGuests(Integer qtdGuests) {
        this.qtdGuests = qtdGuests;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    public Integer getQtdEmployees() {
        if (qtdGuests <= 120) {
            if (qtdGuests <= 60) {
                return 8;
            } else if (qtdGuests <= 80) {
                return 9;
            } else if (qtdGuests <= 100) {
                return 10;
            } else {
                return 12;
            }
        }
        return 14;
    }

    public Double getContractPrice() {
        double employeesPrice = getQtdEmployees() * 200.00;
        Double productsPrice = 0.00;
        for (Product x : products) {
            productsPrice += x.getPrice();
        }
        return productsPrice + employeesPrice + 2000.00;
    }

    public void setContractType(ContractType contractType) {
        if (contractType != null) {
            this.contractType = contractType.getDescription();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contrato: ").append(getId()).append("\n");
        sb.append("Cliente: ").append(client.getName()).append("\n");
        sb.append("Tipo de contrato: ").append(contractType).append("\n");
        sb.append("Quantidade de convidados: ").append(qtdGuests).append("\n");
        sb.append("Data do evento: ").append(eventDate).append("\n");
        sb.append("Produtos: ");
        for (Product x : products) {
            sb.append(x.getName()).append(" ");
        }
        sb.append("\n").append("O preço total é: R$" + getContractPrice());
        return sb.toString();
    }
}
