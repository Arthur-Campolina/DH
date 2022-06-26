public class Projeto {
    private int id;
    private String nome;
    private String cidade;
    private Estado estado;
    private Obra obra;

    public Projeto(int id, String nome, String cidade, Estado estado, Obra obra) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.obra = obra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public boolean terminouNaData() {
        return obra.getDataFimPrevista() == obra.getDataFimReal();
    }

    @Override
    public String toString() {
        return "Projeto: " + nome + "\n" +
                "Id: " + id + "\n" +
                "Cidade: " + cidade + "\n" +
                "Estado: " + estado.getDescricao() + "\n" +
                "Obra: " + obra.getId() + "\n" +
                "Endereço da Obra: " + obra.getEndereco() + "\n" +
                "Data de início da obra: " + obra.getDataIni() + "\n" +
                "Data final prevista da obra: " + obra.getDataFimPrevista() + "\n" +
                "Data final real da obra: " + obra.getDataFimReal() + "\n";
    }
}
