import java.util.Date;

public class Obra {
    private int id;
    private String endereco;
    private Date dataIni;
    private Date dataFimPrevista;
    private Date dataFimReal;

    public Obra(int id, String endereco, Date dataIni, Date dataFimPrevista, Date dataFimReal) {
        this.id = id;
        this.endereco = endereco;
        this.dataIni = dataIni;
        this.dataFimPrevista = dataFimPrevista;
        this.dataFimReal = dataFimReal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataIni() {
        return dataIni;
    }

    public void setDataIni(Date dataIni) {
        this.dataIni = dataIni;
    }

    public Date getDataFimPrevista() {
        return dataFimPrevista;
    }

    public void setDataFimPrevista(Date dataFimPrevista) {
        this.dataFimPrevista = dataFimPrevista;
    }

    public Date getDataFimReal() {
        return dataFimReal;
    }

    public void setDataFimReal(Date dataFimReal) {
        this.dataFimReal = dataFimReal;
    }

 }
