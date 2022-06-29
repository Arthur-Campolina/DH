import java.util.List;

public class Envio implements Estado {

    private Reparo reparo;

    public Envio(Reparo reparo) {
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
        throw new IllegalStateException("Não pode mudar o orcamento aqui");
    }

    @Override
    public void somaPecaReposicao(List<PecaReposicao> pecas) {
        throw new IllegalStateException("Não pode mudar as peças aqui");
    }

    @Override
    public void mudarEndereco(String endereco) {
        reparo.setEndereco(endereco);
    }

    @Override
    public void mudarEstado() {
        reparo.setEstado(new Finalizado(reparo));
    }

    @Override
    public String toString() {
        return "Envio";

    }
}
