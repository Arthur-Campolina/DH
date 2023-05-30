import style from './MyCard.module.css'

export const MyCard = ({ name, age, city, img }) => {
    const imgUrlDefault = 'https://th.bing.com/th/id/OIP.2_x749BtVeuXiN5f1m0xcgHaEo?w=258&h=180&c=7&r=0&o=5&pid=1.7'
    return (
        <>
            <br />
            <div className={style.card}>
                <h1>Name: {name}</h1>
                <br />
                <h2>Age: {age}</h2>
                <h3>City: {city}</h3>
                <br />
                <img className={style.img} src={img ?? imgUrlDefault} />
            </div>
        </>

    )
}