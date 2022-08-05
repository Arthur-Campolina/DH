import java.util.List;

public abstract class Cardapio {

    private double preco;

    public abstract void motagem(List<ItensAdicionais> adicionais);

    public abstract void calcular(double valor);

}
