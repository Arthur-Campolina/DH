public class Filme {

    private String nome;
    private String link;
    private String pais;

    public Filme(String nome, String link, String pais) {
        this.nome = nome;
        this.link = link;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", link='" + link + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
