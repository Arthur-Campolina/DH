import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private final List<OfertaAcademica> cursos;
    private final String nome;

    public Instituto(String nome) {
        this.nome = nome;
        cursos = new ArrayList<>();
    }

    public void adicionar(OfertaAcademica curso) {
        this.cursos.add(curso);
    }

    public void relatorio() {
        for (OfertaAcademica curso : cursos) {
            System.out.println(curso);
        }
    }
}
