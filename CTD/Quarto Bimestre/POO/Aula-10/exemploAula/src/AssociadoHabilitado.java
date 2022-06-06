public class AssociadoHabilitado extends Associado {

    private Double custoPiscina;
    private boolean isHabilitado;

    public AssociadoHabilitado() {
    }

    public AssociadoHabilitado(String numAssociado, String nome, Double valorMensal, String atividade, Double custoPiscina) {
        super(numAssociado, nome, valorMensal, atividade);
        this.custoPiscina = custoPiscina;
        this.isHabilitado = false;
    }

    public Double getCustoPiscina() {
        return custoPiscina;
    }

    public void setCustoPiscina(Double custoPiscina) {
        this.custoPiscina = custoPiscina;
    }

    public boolean isHabilitado() {
        return isHabilitado;
    }

    public void setHabilitado(boolean habilitado) {
        isHabilitado = habilitado;
    }

    @Override
    public Double getValorMensal() {
        if (isHabilitado) {
            return super.getValorMensal() + custoPiscina;
        }
        return super.getValorMensal();
    }

    @Override
    public String toString() {
        return "AssociadoHabilitado{" +
                "custoPiscina=" + custoPiscina +
                ", isHabilitado=" + isHabilitado +
                '}';
    }
}
