public class ApiHotel {

    public String buscaHotel(BuscaHotel buscaHotel) {
        if(buscaHotel.getCidade().equals("BSB")) {
            System.out.println("Hotel disponível em Brasolia!");
            return buscaHotel.toString();
        }
        else if(buscaHotel.getCidade().equals("CNF")) {
            System.out.println("Hotel disponível em BH!");
            return buscaHotel.toString();
        }
        else {
            System.out.println("Hotel não disponível para a cidade informada!");
            return null;
        }
    }
}
