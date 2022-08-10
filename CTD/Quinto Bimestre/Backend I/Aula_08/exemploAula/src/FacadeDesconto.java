public class FacadeDesconto implements IFacadeDesconto {


    // Armazeno as variáveis uma instânica de cada uma;
    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    // Construtor que cria as instancias
    public FacadeDesconto() {
        apiCartao = new ApiCartao();
        apiProduto = new ApiProduto();
        apiQuantidade = new ApiQuantidade();
    }

    //Simplicafica os descontos
    public int desconto(Cartao cartao, Produto produto, int quantidade) {
        int desconto = 0;
        desconto = desconto + apiQuantidade.desconto(quantidade);
        desconto = desconto + apiProduto.desconto(produto);
        desconto = desconto + apiCartao.desconto(cartao);

        return desconto;
    }

}
