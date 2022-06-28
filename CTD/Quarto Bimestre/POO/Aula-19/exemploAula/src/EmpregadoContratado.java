public class EmpregadoContratado extends Empregado{

    private double valorHora;
    private double imposto;

    public EmpregadoContratado(String nome, String sobreNome) {
        super(nome, sobreNome);
    }

    public EmpregadoContratado(String nome, String sobreNome, String arquivo) {
        super(nome, sobreNome, arquivo);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public double calcularSalario(int dias) {
        return (8 * dias * valorHora) - (valorHora * imposto);
    }
}
