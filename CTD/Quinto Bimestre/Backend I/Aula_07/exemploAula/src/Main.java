import model.Computer;
import model.ComputerFactory;

public class Main {
    public static void main(String[] args) {
        ComputerFactory c1 = new ComputerFactory();
        Computer mac1 = c1.getComputer(16, 500);
        Computer mac2 = c1.getComputer(2, 256);
        Computer mac3 = c1.getComputer(16, 500);

        System.out.println(mac2.toString());
        System.out.println(mac1.toString());
        System.out.println(mac3.toString());
    }
}
