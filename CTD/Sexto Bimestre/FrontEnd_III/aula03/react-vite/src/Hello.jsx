const Hello = ({ person }) => {
    const { name, surname, age } = person
    return (
        <p>
            Ola, {name} {surname}! Você tem {age} anos
        </p>
    )
}

export default Hello