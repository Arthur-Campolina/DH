public class Carro {
    private boolean freioAcionado = false;
    private Estado estado = new Desligado(this);

    public boolean getFreioAcionado() {
        return freioAcionado;
    }

    public void setFreioAcionado(boolean freioAcionado) {
        this.freioAcionado = freioAcionado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void apertarBotao() {
        getEstado().startStop();
    }
}
