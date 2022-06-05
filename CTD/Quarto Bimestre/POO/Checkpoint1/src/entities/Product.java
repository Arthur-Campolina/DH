package entities;

public class Product extends AbstractEntity{

    private String name;
    private String brand;
    private Integer qtd;
    private Double price;

    public Product(String name, String brand, Integer qtd, Double price) {
        super();
        this.name = name;
        this.brand = brand;
        this.qtd = qtd;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalPrice() {
        return this.qtd * this.price;
    }
}
