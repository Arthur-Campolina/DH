import java.time.LocalDate;

public class Cachorro {
    private String nome;
    private String raca;
    private int anoNascimento;
    private Double peso;
    private boolean temChip;
    private boolean estaFerido;

    public Cachorro() {
    }

    public Cachorro(
            String nome,
            String raca,
            int anoNascimento,
            Double peso,
            boolean temChip,
            boolean estaFerido
    ) {
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.temChip = temChip;
        this.estaFerido = estaFerido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean temChip() {
        return temChip;
    }

    public void setTemChip(boolean temChip) {
        this.temChip = temChip;
    }

    public boolean estaFerido() {
        return estaFerido;
    }

    public void setEstaFerido(boolean estaFerido) {
        this.estaFerido = estaFerido;
    }

    public String podeAdotar(Double peso, boolean estaFerido) {
        if (this.peso >= 5 && !estaFerido) {
            return ("O " + this.nome + " pode ser adotado!");
        } else {
            return ("O " + this.nome + " não pode ser adotado!");
        }
    }

    public int idade(int anoNascimento) {
        return LocalDate.now().getYear() - anoNascimento;
    }
}
