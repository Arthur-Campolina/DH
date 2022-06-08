public class Preguica extends Animal {

    public Preguica() {
    }

    public Preguica(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public String getSom(String som) {
        return som;
    }

    public Double getSubir(Double distancia) {
        return distancia;
    }
}
