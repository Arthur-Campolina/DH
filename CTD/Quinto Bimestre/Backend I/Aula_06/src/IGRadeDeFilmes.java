public interface IGRadeDeFilmes {

    Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException;
}
