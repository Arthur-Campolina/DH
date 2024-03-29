import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {

    Funcionario f1, f2;
    Afiliado a1, a2, a3;

    @BeforeEach
    public void doBefore() {
        f1 = new Funcionario("Pedro", 2);
        f1.vender(2);

        f2 = new Funcionario("Maria", 1);
        f2.vender(1);

        a1 = new Afiliado("Ramon");
        a1.vender(4);

        a2 = new Afiliado("Paulo");
        a2.vender(1);

        a3 = new Afiliado("José");

        f1.addAfiliado(a1);
        f2.addAfiliado(a2);
    }

    @Test
    public void mostrarVendedores() {
        System.out.println(f1.mostrarCategoria());
        System.out.println(f2.mostrarCategoria());
        System.out.println(a1.mostrarCategoria());
        System.out.println(a2.mostrarCategoria());
        System.out.println(a3.mostrarCategoria());
    }

}
