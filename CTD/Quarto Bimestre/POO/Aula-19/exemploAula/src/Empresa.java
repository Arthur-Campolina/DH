import java.util.Set;

public class Empresa {
//    esse valor e acabou, não muda mais (final)
    private final String cnpj;
    private Set<Empregado> empregados;

    public Empresa(String cnpj, Set<Empregado> empregados) {
        this.cnpj = cnpj;
        this.empregados = empregados;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Set<Empregado> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(Set<Empregado> empregados) {
        this.empregados = empregados;
    }
}
