public abstract class Product {

    private double weight;

    public Product(double weight) {
        this.weight = weight;
    }

    public double getPeso() {
        return weight;
    }

    public void setPeso(double weight) {
        this.weight = weight;
    }

    public abstract double calcularEspaco();
}
