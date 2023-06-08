import style from "./ProductList.module.css";
import React from "react";
import axios from "axios";
import MyCard from "./MyCard";

function ProductList() {
    const [products, setProducts] = React.useState([])

    React.useEffect(() => {
        getProducts()
    }, [])
    async function getProducts() {
        try {
            const response = await axios.get("api/products")
            setProducts(response.data.products)
            console.log(products)
        } catch (error) {
            console.error("Error:", error)
        }
    }
    return (
        <div className={style.div}>
            {products.map(product => (
                <MyCard
                    key={product.id}
                    category={product.category}
                    description={product.description}
                    id={product.id}
                    image={product.image}
                    price={product.price}
                    stock={product.stock}
                    title={product.title}
                />))}
        </div>
    );
}

export default ProductList;