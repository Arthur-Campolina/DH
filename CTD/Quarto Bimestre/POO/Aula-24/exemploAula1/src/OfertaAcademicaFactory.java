public class OfertaAcademicaFactory {

    private final static String FRONT_END = "front";
    private final static String BACK_END = "back";
    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory() {
    }

    public static OfertaAcademicaFactory getInstance() {
        if (instance == null) {
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica criarOfertar(String oferta) {
        return switch (oferta) {
            case FRONT_END -> new Curso(FRONT_END, "front", 16, 10, 1000);
            case BACK_END -> new Curso(BACK_END, "back", 16, 10, 1000);
            default -> new ProgramaIntensivo("Programa Intensivo", "abc", 20);
        };
    }

}
