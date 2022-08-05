public class ItensAdicionais {

    private String nome;
    private double preco;

    public ItensAdicionais(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ItensAdicionais{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
