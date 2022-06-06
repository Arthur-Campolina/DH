package entities;

import entities.enums.ContractType;
import entities.enums.EmployeeType;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Employee extends AbstractEntity {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private String surname;
    private Date birthday;
    private String cpf;
    private String streetNumber;
    private String street;
    private String neighbourhood;
    private String zipCode;
    private String email;
    private String phone;
    private String employeeType;
    private BankAccount bankAccount;

    public Employee() {
    }

    public Employee(String name, String surname, Date birthday, String cpf, String streetNumber, String street, String neighbourhood, String zipCode, String email, String phone, String employeeType, BankAccount bankAccount) {
        super();
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.cpf = cpf;
        this.streetNumber = streetNumber;
        this.street = street;
        this.neighbourhood = neighbourhood;
        this.zipCode = zipCode;
        this.email = email;
        this.phone = phone;
        this.employeeType = employeeType;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getAge() {
        return this.birthday.getYear() - LocalDate.now().getYear();
    }

    public void setEmployeeType(EmployeeType employeeType) {
        if (employeeType != null) {
            this.employeeType = employeeType.getDescription();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + name).append(" ").append(surname).append("\n");
        sb.append("Data de Nascimento: " + sdf.format(birthday) + "\n");
        sb.append("Email: " + email + "\n");
        sb.append("Telefone: " + phone + "\n");
        sb.append("Banco: " + bankAccount.getName() + " " + bankAccount.getAccNumber() + " " + bankAccount.getName() + "\n");
        sb.append("Cpf: " + cpf + "\n");
        sb.append("Endereço: " + streetNumber + " " + street + " " + neighbourhood + " - " + zipCode + "\n");
        return sb.toString();
    }
}
