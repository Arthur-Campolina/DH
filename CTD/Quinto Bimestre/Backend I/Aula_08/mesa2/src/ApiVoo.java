public class ApiVoo {

    public String buscaVoo(BuscaVoo buscaVoo) {
        if(buscaVoo.getDestino().equals("CNF")) {
            System.out.println("Vôo para BH disponível!");
        }
        else if(buscaVoo.getDestino().equals("CWB")) {
            System.out.println("Vôo para Curitola disponível!");
        }
        else {
            System.out.println("Vôo não disponível para a cidade informada!");
        }
        return buscaVoo.toString();
    }
}
