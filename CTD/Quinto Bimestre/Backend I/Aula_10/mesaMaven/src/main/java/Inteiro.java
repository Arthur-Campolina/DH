import java.util.ArrayList;
import java.util.List;

public class Inteiro {

    private List<Integer> list = new ArrayList<>();



    public Integer addList(Integer inteiro) {
        list.add(inteiro);
        return inteiro;
    }

    public void tamanhoList() throws Exception {

        if(list.size() != 0 ) {
            if(list.size() >= 5) {
                System.out.println("Lista contem mais que 5 inteiros");
            }
            if(list.size() > 10) {
                System.out.println("Lista contem mais que 10 inteiros");
            }
            double sum = 0;
            for(Integer inteiro : list) {
                sum += inteiro;
            }
            System.out.println(sum/list.size());
        } else {
            throw new Exception("Sua lista está vazia, meu(minha) amigo(a)");
        }
    }
}
