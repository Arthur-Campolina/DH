import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Projeto projeto = new Projeto("Árvore de Natal", 1, 213);
        Funcionario funcionario1 = new Funcionario(150.00);
        FuncionarioHora funcionario2 = new FuncionarioHora(250.00);

        System.out.println(projeto.getNome());
        System.out.println("Codigo do projeto: " + projeto.getCodigo());
        System.out.println("O funcionario 1 custou: R$" + funcionario1.getCobrancaFixa());
        System.out.println("O funcionario 2 custou: R$" + funcionario2.valorTotal(150.00));

        System.out.println("O custo total do projeto:: R$" + projeto.custoTotalProjeto(funcionario1.getCobrancaFixa(),funcionario2.valorTotal(150.00)));
    }
}
