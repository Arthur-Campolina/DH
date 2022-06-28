public abstract class Empregado {

    private String nome;
    private String sobreNome;
    private String arquivo;

    public Empregado(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public Empregado(String nome, String sobreNome, String arquivo) {
        this(nome, sobreNome);
        this.sobreNome = sobreNome;
        this.arquivo = arquivo;
    }

    public abstract double calcularSalario(int dias);
}
