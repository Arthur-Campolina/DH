public enum Escalacao {

    TITULAR("Jogador Titular"),
    RESERVA("Jogador Reserva"),
    SUPLENTE("Jogador Suplente");

    private String descricao;

    Escalacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Escalacao{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
