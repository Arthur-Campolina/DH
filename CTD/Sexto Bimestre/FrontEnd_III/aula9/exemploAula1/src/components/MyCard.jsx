export const MyCard = ({ name, age, city }) => {
    return (
        <>
            <br />
            <div style={{ border: '1px solid red' }}>
                <h1>Name: {name}</h1>
                <br />
                <h2>Age: {age}</h2>
                <h3>City: {city}</h3>
            </div>
        </>

    )
}