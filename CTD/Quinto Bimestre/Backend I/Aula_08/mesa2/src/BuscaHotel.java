import java.time.LocalDate;

public class BuscaHotel {
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private String cidade;

    public BuscaHotel(LocalDate dataEntrada, LocalDate dataSaida, String cidade) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.cidade = cidade;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "BuscaHotel{" +
                "dataEntrada=" + dataEntrada +
                ", dataSaida=" + dataSaida +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
