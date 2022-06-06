package entities;

public class Client extends AbstractEntity {

    private String name;
    private String surname;
    private String phone;
    private String email;
    private String cpf;
    private String streetNumber;
    private String street;
    private String neighbourhood;
    private String zipCode;
    private BankAccount bankAccount;

    public Client() {
    }

    public Client(String name, String surname, String phone, String email, String cpf, String streetNumber, String street, String neighbourhood, String zipCode, BankAccount bankAccount) {
        super();
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.cpf = cpf;
        this.streetNumber = streetNumber;
        this.street = street;
        this.neighbourhood = neighbourhood;
        this.zipCode = zipCode;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + name).append(" ").append(surname).append("\n");
        sb.append("Email: " + email + "\n");
        sb.append("Telefone: " + phone + "\n");
        sb.append("Cpf: " + cpf + "\n");
        sb.append("Endereço: " + streetNumber + " " + street + " " + neighbourhood + " - " + zipCode + "\n");
        return sb.toString();
    }
}
