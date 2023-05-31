import style from './MyCard.module.css'

export const MyCard = ({ nameAndPosition, country }) => {
    return (
        <div className={style.card}>
            <h2 className={style.text}>{nameAndPosition}</h2>
            <br />
            <h3 className={style.text}>{country}</h3>
        </div>
    )
}