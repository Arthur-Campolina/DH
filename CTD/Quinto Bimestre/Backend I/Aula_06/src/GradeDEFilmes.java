public class GradeDEFilmes implements IGRadeDeFilmes {

    @Override
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException {
        Filme f = null;

        switch (nomeDoFilme) {
            case "The White Tiger":
                f = new Filme("The White Tiger", "www.wtiger.com", "ARG");
                break;
            case "His Houser":
                f = new Filme("His Houser", "www.hhouser.com", "BRA");
                break;
            case "Over the Moon":
                f = new Filme("Over the Moon", "www.omoon.com", "COL");
                break;
            case "Superbad":
                f = new Filme("Superbad", "www.sbad.com", "ARG");
                break;
            case "The Babysitter":
                f = new Filme("he Babysitter", "www.tbaby.com", "COL");
                break;
        }
        return f;
    }
}
