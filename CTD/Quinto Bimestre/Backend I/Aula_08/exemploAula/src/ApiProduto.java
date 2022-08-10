public class ApiProduto {

    public int desconto(Produto produto) {
        if(produto.getTipo().compareToIgnoreCase("Lata") == 0) {
            return 10/100;
        } else {
            return 0;
        }
    }
}
