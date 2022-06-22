public class Jogador implements Comparable<Jogador> {
    private final String nome;
    private final int numeroCamisa;
    private String posicao;
    private Escalacao escalacao;

    public Jogador(String nome, int numeroCamisa, String posicao, Escalacao escalacao) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
        this.escalacao = escalacao;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Escalacao getEscalacao() {
        return escalacao;
    }

    public void setEscalacao(Escalacao escalacao) {
        this.escalacao = escalacao;
    }

    @Override
    public int compareTo(Jogador obj) {
        if (this.numeroCamisa > obj.numeroCamisa) return 1;
        if (this.numeroCamisa < obj.numeroCamisa)   return -1;
        else return 0;
    }
}
