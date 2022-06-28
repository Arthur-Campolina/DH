public class EmpregadoFactory {

    private static EmpregadoFactory instance;

    private EmpregadoFactory() {
    }

    //padrao factory - cria os objetos
    public Empregado criarEmpregado(String tipo, String nome, String sobreNome) {
        if(tipo.equals("EMP-INT")) {
            return new EmpregadoRelacaoDep(nome, sobreNome);
        } else if(tipo.equals("EMP-EXT")) {
            return new EmpregadoContratado(nome, sobreNome);
        }
        throw new IllegalStateException("O tipo não existe");
    }

    //padrao singleton, cria uma instancia do empregado - deve ser statico e o atributo tbm
    public static EmpregadoFactory getInstance() {
        if (instance == null) {
            instance = new EmpregadoFactory();
        }
        return instance;
    }
}
