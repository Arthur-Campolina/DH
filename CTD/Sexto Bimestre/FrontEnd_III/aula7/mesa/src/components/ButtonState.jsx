import React from "react"
let value = 0

export const ButtonState = ({ title }) => {
    const [array, setArray] = React.useState([0])
    const onClickHandler = () => {
        value += 1
        const newValue = [...array, value]
        setArray(newValue)
    }

    return (
        <div>
            <button onClick={onClickHandler}>{title}</button>
            <ul>
                {array.map((v) => <li key={v}>Aqui está o valor {v === 0 ? 'inicial' : `do click ${v}`} : <strong>{v}</strong></li>)}
            </ul>
        </div>
    );
}