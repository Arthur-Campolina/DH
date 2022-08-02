import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    @Test
    void calculos() {
        Funcionario f1 = new Efetivo("Lucas", "Ferreira", "4564", 10000.0, 1.0, 5000.0);
        f1.pagamentoSalario();

        Funcionario f2 = new Contratado("Issao", "Takeuchi", "0174", 500.0, 40);
        f2.pagamentoSalario();
    }
}



