const CityDetails = (cities) => {
    const { id, country, city } = cities
    return (
        <div>
            <h1>{city}</h1>
            <h2>{country}</h2>
        </div>
    )
}

export default CityDetails