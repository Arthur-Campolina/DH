public class Cachorro extends Animal {

   public Cachorro(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public String getSom(String som) {
        return som;
    }

    @Override
    public Double getCorrer(Double distancia) {
        return distancia;
    }
}
