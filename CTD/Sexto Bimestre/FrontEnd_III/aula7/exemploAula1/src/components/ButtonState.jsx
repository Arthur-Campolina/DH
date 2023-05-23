import React from "react"

export const ButtonState = ({ title1, title2 }) => {
    const [value, setValue] = React.useState(0)
    const onClickHandlerSum = () => {
        setValue(value + 1)
    }
    const onClickHandlerSub = () => {
        setValue(value - 1)
    }

    return (
        <div>
            <button onClick={onClickHandlerSum}>{title1}</button>{'      '}
            <button onClick={onClickHandlerSub}>{title2}</button>
            <div>{value}</div>
        </div >
    )
}