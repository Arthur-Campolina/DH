public class Partida implements Estado{

    private Carro carro;

    public Partida(Carro carro) {
        this.carro = carro;
        System.out.println(this.getClass().getName());
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public void startStop() {
        carro.setEstado(new Desligado(carro));
        carro.setFreioAcionado(true);
    }
}
