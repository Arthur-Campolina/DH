public class Administrativo extends Assistente{

    private boolean eNoturno;
    private double addNoturno;

    public Administrativo(String nome, Double salario, String matricula, boolean eNoturno, double addNoturno) {
        super(nome, salario, matricula);
        this.eNoturno = eNoturno;
        this.addNoturno = addNoturno;
    }

    public boolean iseNoturno() {
        return eNoturno;
    }

    public void seteNoturno(boolean eNoturno) {
        this.eNoturno = eNoturno;
    }

    @Override
    public double ganhoAnual() {
        return (!eNoturno) ? super.ganhoAnual() : super.ganhoAnual() + addNoturno;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Turno noturno? " + eNoturno + "\n"
                + "Adicional noturno: " + addNoturno
                ;
    }
}
