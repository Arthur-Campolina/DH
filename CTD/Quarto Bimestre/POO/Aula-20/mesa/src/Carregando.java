public class Carregando implements Estado{

    private Carrinho carrinho;

    public Carregando() {
        setCarrinho(new Carrinho());
    }

    @Override
    public void cancelar() {
        carrinho.setEstado(new Vazio());
    }

    @Override
    public void adicionar(Produto produto) {
        System.out.print("novo produto - carregando");
    }

    @Override
    public void anterior() {
        carrinho.setEstado(new Vazio());
    }

    @Override
    public void proximo() {
        carrinho.setEstado(new Pagando());
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
}
