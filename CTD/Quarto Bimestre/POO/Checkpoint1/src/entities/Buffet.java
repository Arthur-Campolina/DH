package entities;

import java.util.ArrayList;
import java.util.List;

public class Buffet extends AbstractEntity {

    private String name;
    private String cnpj;
    private String streetNumber;
    private String street;
    private String neighbourhood;
    private String zipCode;
    private String email;
    private String phone;
    private List<Employee> employees = new ArrayList<>();
    private List<Contract> contracts = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();
    private List<Supplier> suppliers = new ArrayList<>();

    public Buffet(String name, String cnpj, String streetNumber, String street, String neighbourhood, String zipCode, String email, String phone, List<Employee> employees, List<Contract> contracts, List<Client> clients, List<Supplier> suppliers) {
        super();
        this.name = name;
        this.cnpj = cnpj;
        this.streetNumber = streetNumber;
        this.street = street;
        this.neighbourhood = neighbourhood;
        this.zipCode = zipCode;
        this.email = email;
        this.phone = phone;
        this.employees = employees;
        this.contracts = contracts;
        this.clients = clients;
        this.suppliers = suppliers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    public void addContract(Contract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(Contract contract) {
        this.contracts.remove(contract);
    }

    public void addSupplier(Supplier supplier) {
        this.suppliers.add(supplier);
    }

    public void removeSupplier(Supplier supplier) {
        this.suppliers.remove(supplier);
    }
}
