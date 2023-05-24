import React from "react"
import { MyInput } from "./MyInput"

export const MyForm = ({ title }) => {
    const [nome, setNome] = React.useState('')
    const [isFormValid, setIsFormValid] = React.useState(false)

    const valueHandler = React.useCallback((event) => {
        setNome(event.target.value)
        if (event.target.value.length >= 3) setIsFormValid(true)
    }, [setNome])
    return (
        <form>
            <h3>{title}</h3>
            <MyInput
                label={'Nome'}
                type={'text'}
                fnOnChange={valueHandler}
                value={nome}
            />
            <br />
            <button disabled={!isFormValid}>
                Salvar
            </button>
        </form>
    )
}