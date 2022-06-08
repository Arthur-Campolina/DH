public class Tecnico extends Assistente{

    private Double bonusSalarial;

    public Tecnico(String nome, Double salario, String matricula, Double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    public Double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(Double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + bonusSalarial;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Bonus salarial: " + bonusSalarial
                ;
    }
}
