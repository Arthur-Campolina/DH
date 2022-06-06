public class Objeto {

    private int posx;
    private int posy;
    private char direcao;

    public Objeto(int posx, int posy, char direcao) {
        this.posx = posx;
        this.posy = posy;
        this.direcao = direcao;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    public void irA(int x, int y, char direcao) {
        this.posx = x;
        this.posy = y;
        this.direcao = direcao;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "posx=" + posx +
                ", posy=" + posy +
                ", direcao=" + direcao +
                '}';
    }
}
