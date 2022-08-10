public class ApiQuantidade {

    public int desconto(int qnt) {
        if(qnt > 11) {
            return 15/100;
        } else {
            return 0;
        }
    }
}
