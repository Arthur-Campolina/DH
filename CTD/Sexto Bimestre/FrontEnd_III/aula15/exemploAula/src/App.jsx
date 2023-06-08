import React from "react";
import axios from 'axios'
import './App.css';
import ProductList from "./ProductList";
import Input from "./Input";

function App() {
  const [title, setTitle] = React.useState("");
  const [description, setDescription] = React.useState("");
  const [price, setPrice] = React.useState("");
  const [stock, setStock] = React.useState("");
  const [category, setCategory] = React.useState("");
  const [image, setImage] = React.useState("");
  const [isValid, setIsValid] = React.useState(false)
  const formValidator = () => {
    if (title, description, price, stock, category, image) {
      setIsValid(!isValid)
    }
  }
  const creatProduct = async (event) => {
    event.preventDefault()
    const newProduct = {
      title,
      description,
      price,
      stock,
      category,
      image,
    }
    try {
      const response = await axios.post('api/products', newProduct)
    } catch (error) {
      console.error("Error", error)
    }
  }

  return (
    <>
      <h2>Cadastre seu produto</h2>
      <form>
        <Input
          title="Título"
          type="text"
          value={title}
          fnOnChange={(e) => setTitle(e.target.value)}
          fnOnKeyUp={formValidator}
        />
        <br />
        <Input
          title="Descrição"
          type="text"
          value={description}
          fnOnChange={(e) => setDescription(e.target.value)}
          fnOnKeyUp={formValidator}
        />
        <br />
        <Input
          title="Preço"
          type="text"
          value={price}
          fnOnChange={(e) => setPrice(e.target.value)}
          fnOnKeyUp={formValidator}
        />
        <br />
        <Input
          title="Estoque"
          type="text"
          value={stock}
          fnOnChange={(e) => setStock(e.target.value)}
          fnOnKeyUp={formValidator}
        />
        <br />
        <Input
          title="Categoria"
          type="text"
          value={category}
          fnOnChange={(e) => setCategory(e.target.value)}
          fnOnKeyUp={formValidator}
        />
        <br />
        <Input
          title="IMG Url"
          type="text"
          value={image}
          fnOnChange={(e) => setImage(e.target.value)}
          fnOnKeyUp={formValidator}
        />
        <br />
        <button
          disabled={isValid}
          onClick={creatProduct}>
          Cadastrar
        </button>
      </form>
      <h2>Lista de produtos</h2>
      <ProductList />
    </>
  );
}

export default App;
