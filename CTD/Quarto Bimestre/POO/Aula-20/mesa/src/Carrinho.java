import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private final List<Produto> produtos;
    private Estado estado;

    public Carrinho() {
        this.produtos = new ArrayList<>();
        this.estado = new Vazio();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void addProduto (Produto produto) {
        produtos.add(produto);
    }

    public void removeProduto (Produto produto) {
        produtos.remove(produto);
    }
}
