import style from "./ProductList.module.css"

const MyCard = ({ category, description, id, image, price, stock, title }) => {
    return (
        <div className={style.div}>
            <img className={style.img} src={image} alt={title} />
            <h2 className={style.title}>{title}</h2>
            <p className={style.details}>Category: {category}</p>
            <p className={style.h2}>Description: {description}</p>
            <p className={style.h2}>ID: {id}</p>
            <p className={style.h2}>Price: ${price}</p>
            <p className={style.h2}>Stock: {stock}</p>
        </div>
    )
}

export default MyCard