import java.util.Set;
import java.util.TreeSet;

public class Selecao {
    private String nome;
    private final Set<Jogador> jogadores;

    public Selecao(String nome) {
        this.nome = nome;
        this.jogadores = new TreeSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void removeJogador(Jogador jogador) {
        jogadores.remove(jogador);
    }
}
