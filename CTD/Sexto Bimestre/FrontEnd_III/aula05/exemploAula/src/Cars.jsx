const Car = ({ make, model, year }) => {
    return (
        <div>
            <ul>
                <li>
                    <h1 className="title">{make}</h1>
                    <h2>{model}</h2>
                    <h3>{year}</h3>
                </li>
            </ul>
        </div>
    )
}

export default Car