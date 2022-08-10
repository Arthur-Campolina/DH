import java.util.Objects;

public class FacadeBusca implements IBusca{

    private ApiHotel apiHotel;
    private ApiVoo apiVoo;

    public FacadeBusca() {
        apiVoo = new ApiVoo();
        apiHotel = new ApiHotel();
    }

    @Override
    public String busca(BuscaVoo buscaVoo, BuscaHotel buscaHotel) {
            return apiVoo.buscaVoo(buscaVoo) + "\n" + apiHotel.buscaHotel(buscaHotel);
    }
}
