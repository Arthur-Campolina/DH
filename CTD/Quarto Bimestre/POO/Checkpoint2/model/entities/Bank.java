package model.entities;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    private String name;
    private String address;
    private String cnpj;
    private Set<Account> accounts;

    public Bank(String name, String address, String cnpj, Set<Account> accounts) {
        this.name = name;
        this.address = address;
        this.cnpj = cnpj;
        this.accounts = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    @Override
    public String toString() {
        return name + "\n"
                + address + "\n"
                + "CNPJ: " + cnpj;
    }
}
