package entities;

public class BankAccount extends AbstractEntity {

    private String name;
    private String branch;
    private String accNumber;

    public BankAccount(String name, String branch, String accNumber) {
        super();
        this.name = name;
        this.branch = branch;
        this.accNumber = accNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }
}
