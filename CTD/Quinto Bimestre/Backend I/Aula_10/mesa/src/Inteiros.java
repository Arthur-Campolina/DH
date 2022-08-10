import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class Inteiros {

    private static final Logger logger = Logger.getLogger(Leao.class.getName());

    private List<Integer> list = new ArrayList<>();

    public Integer addList(Integer inteiro) {
        list.add(inteiro);
        return inteiro;
    }
}
