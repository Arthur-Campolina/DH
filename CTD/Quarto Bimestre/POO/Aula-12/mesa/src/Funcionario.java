public abstract class Funcionario {

    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void addAumento(double valor) {
        this.salario += valor;
    }

    public double ganhoAnual() {
        return salario * 12;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +
                "Salário: " + salario;
    }
}
