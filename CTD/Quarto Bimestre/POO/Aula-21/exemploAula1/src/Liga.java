public class Liga implements Estado{

    private Carro carro;

    public Liga(Carro carro) {
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
        if(carro.getFreioAcionado()) {
            carro.setEstado(new Liga(carro));
        } else {
            carro.setEstado(new Partida(carro));
        }
    }
}
