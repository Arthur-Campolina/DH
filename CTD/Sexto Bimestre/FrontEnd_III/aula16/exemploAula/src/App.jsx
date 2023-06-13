import React, { useCallback } from "react";
import axios from 'axios'

import './App.css';
import Input from "./Input";
import style from "./ProductList.module.css"
import MyCard from "./MyCard";
import { useNavigate } from "react-router-dom";

function App() {
  const [id, setId] = React.useState("");
  const [title, setTitle] = React.useState("");
  const [description, setDescription] = React.useState("");
  const [price, setPrice] = React.useState("");
  const [stock, setStock] = React.useState("");
  const [category, setCategory] = React.useState("");
  const [image, setImage] = React.useState("");
  const [isInValid, setIsInValid] = React.useState(true)
  const [products, setProducts] = React.useState([])
  const navigate = useNavigate()
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
  const formValidator = useCallback(() => {
    if (!!title && !!description && !!price && !!stock && !!category && !!image) {
      setIsInValid(false)
    } else {
      setIsInValid(true)
    }
  }, [title, description, price, stock, category, image])
  const creatOrUpdateProduct = async (event) => {
    event.preventDefault()
    if (id) {
      const updatedProduct = {
        title,
        description,
        price,
        stock,
        category,
        image,
      }
      try {
        await axios.put(`api/products/${id}`, updatedProduct)
        getProducts()
        alert("Produto Atualizado!")
      } catch (error) {
        console.error("Error", error)
        alert("Erro: Produto não econtrado!")
      }
    }
    if (!id) {
      const newProduct = {
        title,
        description,
        price,
        stock,
        category,
        image,
      }
      try {
        await axios.post('api/products', newProduct)
        alert("Produto Criado!")
        getProducts()
      } catch (error) {
        console.error("Error", error)
      }
    }
  }

  return (
    <>
      <h2>Cadastre/Atualize seu produto</h2>
      <form>
        <Input
          title="ID"
          type="text"
          value={id}
          fnOnChange={(e) => setId(e.target.value)}
        />
        <br />
        <Input
          title="Título*"
          type="text"
          value={title}
          fnOnChange={(e) => setTitle(e.target.value)}
          fnOnKeyUp={formValidator}
        />
        <br />
        <Input
          title="Descrição*"
          type="text"
          value={description}
          fnOnChange={(e) => setDescription(e.target.value)}
          fnOnKeyUp={formValidator}
        />
        <br />
        <Input
          title="Preço*"
          type="text"
          value={price}
          fnOnChange={(e) => setPrice(e.target.value)}
          fnOnKeyUp={formValidator}
        />
        <br />
        <Input
          title="Estoque*"
          type="text"
          value={stock}
          fnOnChange={(e) => setStock(e.target.value)}
          fnOnKeyUp={formValidator}
        />
        <br />
        <Input
          title="Categoria*"
          type="text"
          value={category}
          fnOnChange={(e) => setCategory(e.target.value)}
          fnOnKeyUp={formValidator}
        />
        <br />
        <Input
          title="IMG Url*"
          type="text"
          value={image}
          fnOnChange={(e) => setImage(e.target.value)}
          fnOnKeyUp={formValidator}
        />
        <br />
        <button
          disabled={isInValid}
          onClick={creatOrUpdateProduct}>
          Cadastrar/Atualizar
        </button>
        <h6 style={{ color: "red" }}>* Obrigatório</h6>
      </form>
      <button onClick={() => navigate(-1)}>Lista de produtos</button>
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
            fnGetProducts={getProducts}
          />))
        }
      </div>
    </>
  );
}

export default App;
