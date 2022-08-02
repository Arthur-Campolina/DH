public class Efetivo extends Funcionario{

    private double salarioBase;
    private double descontos;
    private double bonificacoes;

    public Efetivo(String nome, String sobrenome, String numeroConta, double salarioBase, double descontos, double bonificacoes) {
        super(nome, sobrenome, numeroConta);
        this.salarioBase = salarioBase;
        this.descontos = descontos;
        this.bonificacoes = bonificacoes;
    }

    // Polimorfismo
    @Override
    public double calcularSaldo() {
        return salarioBase + bonificacoes - descontos;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("\nGerado um recibo -- Funcionário Efetifvo");
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("\nFoi depositada uma quantidade de: "+ quantia);
    }
}
