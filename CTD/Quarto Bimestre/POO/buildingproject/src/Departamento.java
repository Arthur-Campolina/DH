public class Departamento extends Projeto implements Comparable<Departamento> {
    private int numAndares;
    private int numDeApartPorAndar;

    public Departamento(int id, String nome, String cidade, Estado estado, Obra obra, int numAndares, int numDeApartPorAndar) {
        super(id, nome, cidade, estado, obra);
        this.numAndares = numAndares;
        this.numDeApartPorAndar = numDeApartPorAndar;
    }

    public int getNumAndares() {
        return numAndares;
    }

    public void setNumAndares(int numAndares) {
        this.numAndares = numAndares;
    }

    public int getNumDeApartPorAndar() {
        return numDeApartPorAndar;
    }

    public void setNumDeApartPorAndar(int numDeApartPorAndar) {
        this.numDeApartPorAndar = numDeApartPorAndar;
    }

    public int numApartamentos() {
        return this.numAndares * this.numDeApartPorAndar;
    }

    @Override
    public int compareTo(Departamento departamento) {
        if (numApartamentos() > departamento.numApartamentos()) {
            return 1;
        }
        return -1;
    }

    public boolean arranhaCeu() {
        return numAndares > 15;
    }
}
