public abstract class OfertaAcademica {
    private final String nome;
    private final String descricao;

    public OfertaAcademica(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract double calcularPreco();

    @Override
    public String toString() {
        return "OfertaAcademica{" +
                "nome='" + nome + '\'' +
                "Preço='" + calcularPreco() + '\'' +
                '}';
    }
}
