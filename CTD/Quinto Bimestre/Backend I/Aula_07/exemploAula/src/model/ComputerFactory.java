package model;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {
    private static Map<String, Computer> macFlyWeight = new HashMap<>();

    public Computer getComputer(int ram, int hd) {
        String id = "id: " + ram + " : " + hd;
        System.out.println(id);

        if(!macFlyWeight.containsKey(id)) {
            macFlyWeight.put(id, new Computer(ram, hd));
            System.out.println("\nPC criado com sucesso");
            return macFlyWeight.get(id);
        }
        System.out.println("\nPC obtido");
        return macFlyWeight.get(id);
    }
}
