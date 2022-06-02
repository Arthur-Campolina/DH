public class Projeto {
    private String nome;
    private Integer codigo;
    private Integer horasTrabalhadas;

    public Projeto() {
    }

    public Projeto(String nome, Integer codigo, Integer horasTrabalhadas) {
        this.nome = nome;
        this.codigo = codigo;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double custoTotalProjeto(Double custoF1, Double custoF2) {
        return custoF1 + custoF2;
    }
}
