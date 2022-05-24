public class UsuarioJogo {
    private String nome;
    private String nickname;
    private String pontuacao;
    private int nivel;

    public UsuarioJogo(String nome, String nickname, String pontuacao, int nivel) {
       this.nome = nome;
       this.nickname = nickname;
       this.pontuacao = pontuacao;
       this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel() {
        this.nivel += 1;
    }

    public void setPontuacao() {
        this.pontuacao += 1;
    }

    public void bonus(String valor) {
        this.pontuacao += valor;
    }
}
