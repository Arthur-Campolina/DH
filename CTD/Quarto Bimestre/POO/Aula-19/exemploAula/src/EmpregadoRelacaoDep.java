public class EmpregadoRelacaoDep extends Empregado{

    private double salarioMensal;

    public EmpregadoRelacaoDep(String nome, String sobreNome) {
        super(nome, sobreNome);
    }

    public EmpregadoRelacaoDep(String nome, String sobreNome, String arquivo) {
        super(nome, sobreNome, arquivo);
    }

    @Override
    public double calcularSalario(int dias) {
        return salarioMensal/30 * dias;
    }
}
