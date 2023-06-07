import style from './MyCard.module.css'

export const MyCard = ({ name, email, body }) => {
    return (
        <div className={style.card}>
            <h3>{name} - {email}</h3>
            <p>{body}</p>
        </div>
    )
}