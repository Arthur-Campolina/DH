import java.util.List;

public class Orcamento implements Estado {

    private Reparo reparo;

    public Orcamento(Reparo reparo) {
        this.reparo = reparo;
        System.out.println(reparo);
    }

    @Override
    public void valorOrcamento(double valor) {
        this.reparo.setCusto(valor);
    }

    @Override
    public void somaPecaReposicao(List<PecaReposicao> pecas) {
        throw new IllegalStateException("Voce precisa estar no estado de reparo");
    }

    @Override
    public void mudarEndereco(String endereco) {
        throw new IllegalStateException("Voce não pode mudar o endereço aqui");
    }

    @Override
    public void mudarEstado() {
        this.reparo.setEstado(new Reparacao(reparo));
    }

    @Override
    public String toString() {
        return "Orcamento";
    }
}
