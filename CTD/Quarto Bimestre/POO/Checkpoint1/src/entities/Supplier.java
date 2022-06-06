package entities;

public class Supplier extends AbstractEntity {

    private String name;
    private String cnpj;
    private String phone;
    private String email;
    private String streetNumber;
    private String street;
    private String neighbourhood;
    private String zipCode;

    public Supplier() {
    }

    public Supplier(String name, String cnpj, String phone, String email, String streetNumber, String street, String neighbourhood, String zipCode) {
        super();
        this.name = name;
        this.cnpj = cnpj;
        this.phone = phone;
        this.email = email;
        this.streetNumber = streetNumber;
        this.street = street;
        this.neighbourhood = neighbourhood;
        this.zipCode = zipCode;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fornecedor: " + getId() + "\n");
        sb.append("Nome: " + name + "\n");
        sb.append("Cnpj: " + cnpj + "\n");
        sb.append("Telefone: " + phone + "\n");
        sb.append("Email: " + email +"\n");
        sb.append("Endereço: " + streetNumber + " " + street + " " + neighbourhood + " - " + zipCode);
        sb.append("Email: " + email +"\n");
        sb.append("Email: " + email +"\n");
        sb.append("Email: " + email +"\n");
        return sb.toString();
    }
}
