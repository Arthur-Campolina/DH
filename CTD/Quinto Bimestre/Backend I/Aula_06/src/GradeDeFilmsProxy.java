public class GradeDeFilmsProxy implements IGRadeDeFilmes{

    private GradeDEFilmes gradeDEFilmes;
    private Ip ipRec;

    public GradeDeFilmsProxy(GradeDEFilmes gradeDEFilmes) {
        this.setFilme(gradeDEFilmes);
    }

    public void setIp(Ip ip) {
        this.ipRec = ip;
    }


    @Override
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException {
        Filme f = gradeDEFilmes.getFilme(nomeDoFilme);

        if(!(getIp().getPais()).equalsIgnoreCase(f.getPais())) {
            throw new FilmeNaoHabilitadoException(nomeDoFilme + " não é disponivel neste país!!! " + getIp());
        }
        return f;
    }

    public void setFilme(GradeDEFilmes filme) {
        this.gradeDEFilmes = filme;
    }

    public Ip getIp() {
        return ipRec;
    }
}
