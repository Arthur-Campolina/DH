import { HotelCard } from "../components/HotelCard"
import { hotels } from "../utils/hotels"

export const Home = () => {
    return (
        <>
            <h1>Hoteis disponíveis</h1>
            <div style={
                {
                    display: "flex",
                    flexWrap: "wrap",
                    justifyContent: "center",
                }
            }>
                {
                    <div>
                        {hotels.map(hotel => <HotelCard hotel={hotel} key={hotel.id} />)}
                    </div>
                }
            </div>

        </>
    )
}