//Validação que usa propriedades de subclasse apenas
//Classe abstrata - aqui vai o Template Method

public abstract class Vendedor {

    protected String nome;
    protected int vendas = 0;
    protected int pontosPorVenda;

    public void vender(int qtdVendas) {
        this.vendas += qtdVendas;
        System.out.println(this.nome + " realizou " + qtdVendas + " vendas!");
    }

//Metodo que calcula os pontos do Vendedor de acordo com os seus aspectos as serem considerados
    public abstract int calcularPontos();

//Template Method -- recebe o total de pontos calculados a partir da minha subclasse e vai validar cada item para retornar a categoria
    public String mostrarCategoria() {
        int pontosVendedor = calcularPontos();
        return this.nome + " tem um total de " + pontosVendedor + " pontos e categoriza como " + getNomeCategoria(pontosVendedor);
    }

//Recebo os pontos e informo uma categorização
    private String getNomeCategoria(int pontosVendedor) {
        if(pontosVendedor < 20) {
            return "Vendedor Novato";
        } else if (pontosVendedor < 31) {
            return "Vendedor Aprendiz";
        } else if (pontosVendedor < 41) {
            return "Vendedor Bom";
        } else {
            return "Vendedor Mestre";
        }
    }



}
