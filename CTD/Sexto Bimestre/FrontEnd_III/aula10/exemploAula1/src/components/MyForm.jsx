import * as React from "react"
import { MyInput } from "./MyInput"
import { CardList } from "./CardsList"
import { MyCard } from "./MyCard/MyCard";

const people = [
    {
        name: "João",
        age: 25,
        city: "São Paulo"
    },
    {
        name: "Maria",
        age: 30,
        city: "Rio de Janeiro"
    },
    {
        name: "Carlos",
        age: 40,
        city: "Belo Horizonte"
    },
    {
        name: "Ana",
        age: 35,
        city: "Salvador"
    }
];

export const MyForm = ({ title }) => {
    const [nome, setNome] = React.useState('')
    const [list, setList] = React.useState(people)

    const inputValueHandler = React.useCallback((event) => {
        setNome(event.target.value)
    }, [setNome])

    const buttonHandler = React.useCallback((event) => {
        event.preventDefault()
        const newObject = {
            name: nome,
            age: 25,
            city: nome,
        }
        setList((previousArray) => [...previousArray, newObject])
        console.log(list)
        setNome('')
    }, [setList, list])

    return (
        <form>
            <h3>{title}</h3>
            <MyInput
                label={'Nome'}
                type={'text'}
                fnOnChange={inputValueHandler}
                value={nome}
            />
            <br />
            <button onClick={buttonHandler}>
                Salvar
            </button>
            <CardList>
                {people.map((p) => <MyCard name={p.name} age={p.age} city={p.city} key={`${p.name}/${p.age}`} />)}
            </CardList>
        </form>
    )
}