public class Casa extends Projeto {
    private Double tamanhoTerreno;
    private int numQuartos;
    private int numBanheiros;

    public Casa(int id, String nome, String cidade, Estado estado, Obra obra, Double tamanhoTerreno, int numQuartos, int numBanheiros) {
        super(id, nome, cidade, estado, obra);
        this.tamanhoTerreno = tamanhoTerreno;
        this.numQuartos = numQuartos;
        this.numBanheiros = numBanheiros;
    }

    public Double getTamanhoTerreno() {
        return tamanhoTerreno;
    }

    public void setTamanhoTerreno(Double tamanhoTerreno) {
        this.tamanhoTerreno = tamanhoTerreno;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public int getNumBanheiros() {
        return numBanheiros;
    }

    public void setNumBanheiros(int numBanheiros) {
        this.numBanheiros = numBanheiros;
    }
}
