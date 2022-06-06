public class Nave extends Objeto{

    private Double velocidade;
    private int vida;

    public Nave(int posx, int posy, char direcao, Double velocidade) {
        super(posx, posy, direcao);
        this.velocidade = velocidade;
        this.vida = 100;
    }
}
