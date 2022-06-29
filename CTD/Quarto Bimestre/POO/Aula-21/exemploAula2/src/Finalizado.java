import java.util.List;

public class Finalizado implements Estado {

    public Reparo reparo;

    public Finalizado(Reparo reparo) {
        this.reparo = reparo;
        System.out.println(reparo);
    }

    public Reparo getReparo() {
        return reparo;
    }

    public void setReparo(Reparo reparo) {
        this.reparo = reparo;
    }

    @Override
    public void valorOrcamento(double valor) {
        throw new IllegalStateException("Orcamento não pode ser mudado aqui");
    }

    @Override
    public void somaPecaReposicao(List<PecaReposicao> pecas) {
        throw new IllegalStateException("valor não pode ser mudado aqui");
    }

    @Override
    public void mudarEndereco(String endereco) {
        throw new IllegalStateException("Endereco não pode ser mudado aqui");
    }

    @Override
    public void mudarEstado() {
        throw new IllegalStateException("Finalizado, não pode mudar de estado");
    }

    @Override
    public String toString() {
        return "Finalizado";
    }
}
