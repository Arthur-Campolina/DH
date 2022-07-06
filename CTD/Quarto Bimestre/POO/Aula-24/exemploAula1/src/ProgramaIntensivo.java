import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{

    private double porcentagemBoni;
    private List<Curso> cursos;

    public ProgramaIntensivo(String nome, String descricao, double porcentagemBoni) {
        super(nome, descricao);
        this.porcentagemBoni = porcentagemBoni;
        this.cursos = new ArrayList<>();
    }

    public double getPorcentagemBoni() {
        return porcentagemBoni;
    }

    public void setPorcentagemBoni(double porcentagemBoni) {
        this.porcentagemBoni = porcentagemBoni;
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

    public void removeCurso(Curso curso) {
        cursos.remove(curso);
    }

    @Override
    public double calcularPreco() {
        double valor = 0;
        for (Curso curso : cursos) {
            valor += curso.calcularPreco();
        }
        valor -= valor * porcentagemBoni/100;
        return valor;
    }
}
