import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Empresa empresa1 = new Empresa();
        List<Funcionario> funcionarios = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Funcionario f = new Funcionario("f" + String.valueOf(i), "s" + String.valueOf(i), "12313" + String.valueOf(i), 2000d + i);
            funcionarios.add(f);
        }
        empresa1.setCnpj("123456");
        empresa1.setRazaoSocial("TechArt");
        empresa1.setFuncionarios(funcionarios);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("empresa.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(empresa1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Empresa empresa2 = new Empresa();
        try {
            FileInputStream fileInputStream = new FileInputStream("empresa.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            empresa2 = (Empresa) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
        System.out.println(empresa2);
    }
}
