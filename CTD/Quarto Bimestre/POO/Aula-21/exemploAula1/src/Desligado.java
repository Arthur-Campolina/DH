public class Desligado implements Estado{

    private Carro carro;

    public Desligado(Carro carro) {
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
            carro.setEstado(new Desligado(carro));
        }
    }
}
