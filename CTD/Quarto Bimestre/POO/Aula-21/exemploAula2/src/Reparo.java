public class Reparo {
    private String nome;
    private double custo;
    private String endereco;
    private Estado estado;

    public Reparo(String nome, double custo) {
        this.estado = new Orcamento(this);
        this.nome = nome;
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void proximo() {
        estado.mudarEstado();
    }

    @Override
    public String toString() {
        return "Reparo{" +
                "nome='" + nome + '\'' +
                ", custo=" + custo +
                ", endereco='" + endereco + '\'' +
                ", estado=" + estado +
                '}';
    }
}
