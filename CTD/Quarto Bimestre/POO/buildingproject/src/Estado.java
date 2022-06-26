public enum Estado {

    CALCULANDO("Calculando"),
    CONSTRUCAO("Construção"),
    ACABADO("Acabado");

    private final String descricao;

    Estado(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Estado conteudo(String descricao) {
        for (Estado value : Estado.values()) {
            if (value.getDescricao().equals(descricao)) {
                return value;
            }
        }
        throw new IllegalArgumentException("Estado da obra inválido!");
    }
}
