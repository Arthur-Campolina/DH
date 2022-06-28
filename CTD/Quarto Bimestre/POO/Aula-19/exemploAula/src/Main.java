public class Main {

    public static void main(String[] args) {
        EmpregadoFactory ef = EmpregadoFactory.getInstance();
        Empregado empregado = ef.criarEmpregado("nome", "sobrenome", "EMP-EXT");
    }
}
