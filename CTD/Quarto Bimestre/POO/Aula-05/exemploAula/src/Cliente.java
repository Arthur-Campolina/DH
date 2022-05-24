public class Cliente {
    private Integer numeroCliente;
    private String nome;
    private Double divida = 0.0;

    public Cliente(Integer numeroCliente, String nome, Double divida) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = divida;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDivida() {
        return divida;
    }

    public void aumentarDivida(Double valor) {
        this.divida += valor;
    }

    public void pagarDivida(Double valor) {
        if (this.divida <= 0) {
            System.out.print("Sua divida já está paga!");
        } else if (valor > this.divida) {
            System.out.print("Valor superior, sua dívida é de R$" + this.divida);
        } else {
            this.divida -= valor;
        }
    }
}
