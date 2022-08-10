import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacadeDescontoTeste {
    private FacadeDesconto facedeDesconto = new FacadeDesconto();
    private Cartao cartao;
    private Produto produto;

    @BeforeEach
    void doBefore() {
        cartao = new Cartao("123145123", "Star Bank");
        produto = new Produto("Ervilhas", "Laca");
    }

    @Test
    void validarDescontoBancoteste() {
        produto.setTipo("enlatado");
        int desconto = facedeDesconto.desconto(cartao, produto, 1);
        assertEquals(20, desconto);
    }

    @Test
    void validarDescontoProdutoTeste() {
        cartao.setBanco("Oto Banko");
        int desconto;
        desconto = facedeDesconto.desconto(cartao, produto, 1); ;
        assertEquals(10, desconto);
    }

    @Test
    void validarDescontoQuantidadeTest() {
        produto.setTipo("Enlatado");
        produto.setTipo("Oto Canco");

        int desconto = facedeDesconto.desconto(cartao, produto, 12);

        assertEquals(45, desconto);
    }
}
