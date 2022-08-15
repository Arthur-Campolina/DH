public class Usuario {
    private Long id;
    private String nome;
    private String email;
    private double saldo;

    public Usuario(String nome, String email, double saldo) {
        this.nome = nome;
        this.email = email;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSaldo() {
        return saldo;
    }

    public double addSaldo(double valor) {
        return this.saldo += valor;
    }

    public double removeSaldo(double valor) {
        return this.saldo -= valor;
    }
}
