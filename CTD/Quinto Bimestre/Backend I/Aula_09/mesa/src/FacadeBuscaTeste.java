import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class FacadeBuscaTeste {
    private FacadeBusca facadeBusca = new FacadeBusca();
    private BuscaHotel buscaHotel;
    private BuscaVoo buscaVoo;

    @BeforeEach
    void doBefore() {
        buscaHotel = new BuscaHotel(
                LocalDate.of(2023,1,10),
                LocalDate.of(2023,1,15),
                "CWB"
                );
        buscaVoo = new BuscaVoo(
                LocalDate.of(2023,1,10),
                LocalDate.of(2023,1,15),
                "CWB",
                "CWB"
        );
    }

    @Test
    void validarBusca() {
       String busca = facadeBusca.busca(buscaVoo, buscaHotel);
        System.out.println(busca);
    }

//    @Test
//    void validarBuscaCWB() {
//
//        System.out.println(busca);
//    }
}
