public class ApiCartao {

    public int desconto(Cartao cartao) {
        if(cartao.getBanco().compareToIgnoreCase("Star Bank") == 0) {
            return 20/100;
        } else {
            return 0;
        }
    }
}
