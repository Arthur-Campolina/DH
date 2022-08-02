import java.util.ArrayList;

public class Funcionario extends Vendedor{

    private int anosAntiguidade;
    private ArrayList<Vendedor> afiliados = new ArrayList<>();

    public Funcionario(String nome, int anosAntiguidade) {
        super.nome = nome;
        super.pontosPorVenda = 5;
        this.anosAntiguidade = anosAntiguidade;
    }

//Agregar um afiliado ao meu funcionário e por sua vez somar os pontos
    public void addAfiliado(Vendedor afiliado) {
        this.afiliados.add(afiliado);
        System.out.println(afiliado.nome + " agora é afiliado de " + super.nome);
    }

//Implementação do metodo abstrato por ano de antiguidade obtem-se 5 pontos, por cada afiliado obtem-se 10 pontos.
    @Override
    public int calcularPontos() {
        return ((this.afiliados.size() * 10) + (this.anosAntiguidade * 5));
    }
}
