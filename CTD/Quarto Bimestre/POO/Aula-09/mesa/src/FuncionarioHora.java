public class FuncionarioHora extends Funcionario {

    private Double cobrancaHorasTrabalhadas;

    public FuncionarioHora(Double cobrancaHorasTrabalhadas) {
        this.cobrancaHorasTrabalhadas = cobrancaHorasTrabalhadas;
    }

    public FuncionarioHora(Double cobrancaFixa, Double cobrancaHorasTrabalhadas) {
        super(cobrancaFixa);
        this.cobrancaHorasTrabalhadas = cobrancaHorasTrabalhadas;
    }

    public Double getCobrancaHorasTrabalhadas() {
        return cobrancaHorasTrabalhadas;
    }

    public void setCobrancaHorasTrabalhadas(Double cobrancaHorasTrabalhadas) {
        this.cobrancaHorasTrabalhadas = cobrancaHorasTrabalhadas;
    }

    public Double valorTotal(Double cobrancaFixa) {
        return this.getCobrancaHorasTrabalhadas() + cobrancaFixa;
    }

}
